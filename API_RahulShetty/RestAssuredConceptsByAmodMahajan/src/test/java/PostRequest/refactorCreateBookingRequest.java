package PostRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class refactorCreateBookingRequest {
	
	@Test
	public void createBooking() {
		
		// RestAssured is the main class that contains almost all methods
		// RequestSpecification is an interface which is an empty jar that is nothing (empty as of now)
		// Method chaining is possible because the methods of that class return the same reference 
		// so that you can call the another method of that class without any problem 
		
		//RequestSpecification spec = RestAssured.given();
		//RequestSpecification spec = RestAssured.given().log().all();
		//RequestSpecification spec = RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/");
		
		// 1) Build Request
		RestAssured
		 .given()
		 .log()
		 .all()
		 .baseUri("https://restful-booker.herokuapp.com/")
		 .basePath("booking")
		 .body("{\r\n"
				+ "    \"firstname\" : \"Rahul\",\r\n"
				+ "    \"lastname\" : \"Malik\",\r\n"
				+ "    \"totalprice\" : 1110,\r\n" 
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Dinner\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		// 2) Hit the request
		.when().post() // return type of post request is Response
		// Validate the response
		.then()
		.log()
		.all()
		.statusCode(200); // when we hit the post we get return type as Response
		 
		//Response response = spec.post();
		
		// 3) Validate response
		
		//ValidatableResponse validate = response.then().log().all();
		//validate.statusCode(200);

	}
}
