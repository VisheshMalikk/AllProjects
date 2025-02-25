import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.testng.Assert;

import files.reuseableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Basics {
	// JIRA Server ID : BHYO-SRSL-GJIL-6L78
	// Jira Username : Vishesh
	// Jira Password : 1@Hanuman2345
	// Jira Software/Server download URL : https://www.atlassian.com/software/jira/download-journey
	// Jira Rest APIs URL : https://docs.atlassian.com/software/jira/docs/api/REST/9.14.0/

	public static void main(String[] args) throws IOException {
		
		// 1) Validate if Add Place API is working as expected
		// Add Place --> Update place with new address --> Get place to validate if new address present in response
		// ----------------------- Add Place to Map API ------------------------------------------
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String postResponse = given().log().all()
				.queryParam("key ", "qaclick123")
				// How to send static JSON files directly in the body
				.header("Content-Type", "application/json")
				.body(new String(Files.readAllBytes(Paths.get("C:\\AutomationPractice\\API_RahulShetty\\Coforge\\Resources\\AddPlace.json"))))
				.when().post("/maps/api/place/add/json")
				.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
				.header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();

		System.out.println(postResponse);
		JSONObject obj = new JSONObject(postResponse);
		obj.getString("place_id");
		JsonPath js = reuseableMethods.rawToJson(postResponse); // for parsing json
		String placeId = js.getString("place_id");

		System.out.println("Place ID is : " + placeId);
		
		String newAddress = "70 winter walk, INDIA";

		// ----------- Update place with New Address ----------------
		given().log().all().queryParam("key ", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + placeId + "\",\r\n" + "\"address\":\"" + newAddress + "\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "")
				.when().put("/maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));
		
		
		
		// ------------- Get updated Address : Validating that Address is updated or not ------------
		String getResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId) 
		// For http GET method we are not sending any body so don't use Header Content-Type = application/json , everything should be the part of URL
		.when().get("/maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println("Get Response :" + getResponse);
		
		
		JsonPath js1 = reuseableMethods.rawToJson(getResponse);
		String actualAddress = js1.getString("address");
		
		Assert.assertEquals(actualAddress, newAddress);

	}
}





















