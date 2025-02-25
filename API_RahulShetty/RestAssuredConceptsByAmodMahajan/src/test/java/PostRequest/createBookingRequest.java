package PostRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class createBookingRequest {
	
	@Test
	public void createBooking() {
		// 1) Build Request
		// RestAssured is the main class that contains almost all methods
		// RequestSpecification is an interface which is an empty jar that is nothing (empty as of now)
		RequestSpecification spec = RestAssured.given();
		spec = spec.log().all();
		spec.baseUri("https://restful-booker.herokuapp.com/");
		spec.basePath("booking");
		
		spec.body("{\r\n"
				+ "    \"firstname\" : \"Vishesh\",\r\n"
				+ "    \"lastname\" : \"Malik\",\r\n"
				+ "    \"totalprice\" : 11100,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Lunch\"\r\n"
				+ "}");
		spec.contentType(ContentType.JSON);
		
		// 2) Hit Request
		System.out.println("Hit the request");
		Response response = spec.when().post();
		
		// 3) Validate response
		
		ValidatableResponse validate = response.then().log().all();
		validate.statusCode(200);
		
		
		
		
	}

}
