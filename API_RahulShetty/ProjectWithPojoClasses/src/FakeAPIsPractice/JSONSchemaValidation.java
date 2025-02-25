package FakeAPIsPractice;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JSONSchemaValidation {

	@Test
	public void jsonschemavalidation() {

		// we have to test that according to our schema , so our response should ne
		// generated acc to schema

		RestAssured.baseURI = "https://reqres.in/";

		given().header("Content-Type", "application/json").when().get("api/users?page=2")
		.then()
		.assertThat()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("jsonschema.json"));
		
		//JsonSchemaValidator.matchesJsonSchema
		
		
	}

}
