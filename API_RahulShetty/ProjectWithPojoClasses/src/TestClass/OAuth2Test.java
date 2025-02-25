package TestClass;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class OAuth2Test {

	@Test
	public void grantTypeOAuth() throws InterruptedException {

		String url = "https://rahulshettyacademy.com/getCourse.php?code=4%2F0AdLIrYfcdUSsZgxkSsSIOYyTZlcX0Z8g5rPO_K8G_Fy0ap7SXjWSk70MGoOgtfw8Gw40Pw&scope=email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&authuser=0&prompt=consent";
		String trimmedString = url.split("code=")[1];
		String code = trimmedString.split("&scope")[0];

		// Access Token Request : Get Access Token
		String accessTokenResponse = given().queryParams("code", code)
				.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
				.queryParams("grant_type", "authorization_code").when()
				.post("https://www.googleapis.com/oauth2/v4/token").then().log().all().extract().response().asString();

		JsonPath jp = new JsonPath(accessTokenResponse);
		String accessToken = jp.getString("access_token");

		// Main Request to get Courses
		String response = given().queryParam("access_token", accessToken).when()
				.get("https://rahulshettyacademy.com/getCourse.php").then().log().all().assertThat().statusCode(200)
				.extract().response().asString();
		System.out.println(response);
	}

}
