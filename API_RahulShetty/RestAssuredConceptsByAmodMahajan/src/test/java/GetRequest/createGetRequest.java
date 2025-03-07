package GetRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class createGetRequest {
	
	
	@Test
	public void getBooking() {
		
		Response res = RestAssured.given()
		.log().all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking/{id}")
		.pathParam("id", 2)
		.when()
		.get();
		
		ValidatableResponse validatableResponse = res.then().log().all();
		validatableResponse.statusCode(200);
	}

}
