package JiraAPITests;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import Utils.reuseableMethods;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class AddComment {
	
	String issueId = null;
	
	@Test(enabled = true)
	public void addComment() throws IOException {
		RestAssured.baseURI = "http://localhost:8080";
		SessionFilter session = new SessionFilter();
		// Get Session ID
		String sessionIdResponse = given().log().all().header("Content-Type", "application/json").body("{ \"username\": \"Vishesh\", \"password\": \"1@Hanuman2345\" }")
								   .filter(session).when().post("/rest/auth/1/session")
				                   .then().assertThat().statusCode(200).extract().response().asString();
		System.out.println("The Session Response is :" + sessionIdResponse);
		
		String response = given().log().all().header("Content-Type", "application/json").body(new String(Files.readAllBytes(Paths.get("C:\\AutomationPractice\\API_RahulShetty\\JiraProject\\resources\\JiraCreateIssue.json"))))
				         .filter(session).when().post("/rest/api/2/issue")
				         .then().assertThat().statusCode(201).extract().response().asString();
		System.out.println("Create Issue response is :" + response);
		JsonPath js =  reuseableMethods.rawToJson(response);
		issueId = js.getString("id");
		System.out.println("Issue ID is : " + issueId);
		
		String addCommentResponse = given().log().all().pathParam("key", issueId).header("Content-Type", "application/json").body(new String(Files.readAllBytes(Paths.get("C:\\AutomationPractice\\API_RahulShetty\\JiraProject\\resources\\JiraAddComment.json"))))
									.filter(session).when().post("/rest/api/2/issue/{key}/comment")
									.then().assertThat().statusCode(201).extract().response().asString();
		System.out.println("Add Comment response is :" + addCommentResponse);
	}
	
	
	

}
