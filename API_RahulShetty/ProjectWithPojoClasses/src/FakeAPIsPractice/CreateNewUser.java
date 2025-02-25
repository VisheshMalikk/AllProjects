package FakeAPIsPractice;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class CreateNewUser {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		String response = given().log().all().header("content-type", "application/json")
				.body("{\r\n"
						+ "    \"name\": \"Vishesh\",\r\n"
						+ "    \"job\": \"APITester\"\r\n"
						+ "}")
				.when().post("api/users")
				.then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		System.out.println("Response is : " + response);
		

	}

}
