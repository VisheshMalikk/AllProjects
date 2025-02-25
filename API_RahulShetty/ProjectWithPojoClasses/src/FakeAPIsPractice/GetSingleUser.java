package FakeAPIsPractice;

import static io.restassured.RestAssured.given;
import org.json.JSONObject;

import io.restassured.RestAssured;

public class GetSingleUser {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://reqres.in/";

		String response = given().log().all().header("content-type", "application/json").when().get("api/users/2")
				.then().assertThat().statusCode(200).extract().response().asString();

		System.out.println("Single user response is : " + response);
		JSONObject jo = new JSONObject(response);

		System.out.println(jo.length());
		JSONObject jsonObjectData = jo.getJSONObject("data");

		String email = jsonObjectData.getString("email");
		System.out.println(email);

	}

}
