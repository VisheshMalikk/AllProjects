package JiraAPITests;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pojos.Api;
import Pojos.Pojos;
import Pojos.WebAutomation;
import io.restassured.path.json.JsonPath;

public class OAuthDeserializationTest {
	
	@Test
	public void OAuth() {
	
		String[] expectedTitles = {"Selenium Webdriver Java", "Cypress", "Protractor"};
		String response  = given()
		.formParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.formParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.formParams("grant_type", "client_credentials")
		.formParams("scope", "trust")
		.when().log().all()
		.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
		System.out.println("Response for Access Token is : " + response);
		 
		JsonPath js = new JsonPath(response);
		String accessToken = js.get("access_token").toString();		
		
		Pojos cd = given().queryParam("access_token", accessToken).log().all()
		.when().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
		.then().log().all().extract().as(Pojos.class);
		
		System.out.println("LINKEDIN : "   + cd.getLinkedIn());
		System.out.println("INSTRUCTOR : " + cd.getInstructor());
			
		String title = cd.getCourses().getApi().get(1).getCourseTitle();
		System.out.println(title);
		
		// Get price of SOAP UI Course
		List<Api> apis = cd.getCourses().getApi();
		
		for (int i = 0; i < apis.size(); i++) {
			if(apis.get(i).getCourseTitle().equals("SoapUI Webservices testing")) {
				String price = apis.get(i).getPrice();
				System.out.println("Price of the SOAPUI Webservices API course is : " + price);
			}
		}
		
		// Now lets print all course title of WebAutomation course :
		ArrayList<String> actualTitleArrList = new ArrayList<String>();
		List<WebAutomation> webautomation = cd.getCourses().getWebAutomation();
		for (int i = 0; i < webautomation.size(); i++) {
			actualTitleArrList.add(webautomation.get(i).getCourseTitle());
		}
		// Now we need to convert expectedTitles which is an arrary to ArrayList to compare
		List<String> expectedConvertedList = Arrays.asList(expectedTitles);
		Assert.assertTrue(actualTitleArrList.equals(expectedConvertedList));
		System.out.println("Passed : Titles are matched");
	}
}
