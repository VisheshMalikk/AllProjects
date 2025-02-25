package restUtils;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestUtils {

	// Overloaded method
	public static Response performPostRequest(String endPoint, String requestPayload, Map<String, String> headers) {
		return  RestAssured.given().log().all().baseUri(endPoint)
				.headers(headers)
				.contentType(ContentType.JSON)
				.body(requestPayload)
				.post()
				.then().extract().response();
	}
	// Overloaded method
	public static Response performPostRequest(String endPoint, Map<String, Object> requestPayload, Map<String, String> headers) {
		return  RestAssured.given().log().all().baseUri(endPoint)
				.headers(headers)
				.contentType(ContentType.JSON)
				.body(requestPayload)
				.when().post()
				.then().extract().response();
	}
}
