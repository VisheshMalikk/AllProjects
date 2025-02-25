package FakeAPIsPractice;

import static io.restassured.RestAssured.given;
import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;

public class GetListOfUsers {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		String response = given().log().all().header("Content-Type", "application/json")
		.when().get("api/users?page=2")
		.then().assertThat().statusCode(200).extract().response().asString();

		System.out.println(response);
		
		JSONObject obj = new JSONObject(response);
		
		System.out.println("Per page object : " + obj.getInt("per_page"));
		
		JSONArray ja = obj.getJSONArray("data");
		
		System.out.println("Nested Array length : " + ja.length());
		
		for (int i = 0; i < ja.length(); i++) {
			JSONObject njo = ja.getJSONObject(i);
			int id = njo.getInt("id");
			if(id == 8) {
				String lName = njo.getString("last_name");
				System.out.println("Lat Name is : " + lName);
			}
		}
		
	}

}
