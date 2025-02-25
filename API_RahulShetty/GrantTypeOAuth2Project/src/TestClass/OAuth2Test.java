package TestClass;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class OAuth2Test {

	@Test
	public void grantTypeOAuth() throws InterruptedException {
		
		// Authorization Server request to get Code : Now Google won't allow to automate its own gmail service so below code will not work
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishesh.1.Malik\\Pictures\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php");
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("visheshmalikk@gmail.com");
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1@Hanuman2345");
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.ENTER);
//		Thread.sleep(4000);
//		String url = driver.getCurrentUrl();
		String url = "https://rahulshettyacademy.com/getCourse.php?code=4%2F0AdLIrYfcdUSsZgxkSsSIOYyTZlcX0Z8g5rPO_K8G_Fy0ap7SXjWSk70MGoOgtfw8Gw40Pw&scope=email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&authuser=0&prompt=consent";
		String trimmedString = url.split("code=")[1];
		String code = trimmedString.split("&scope")[0];


		// Access Token Request : Get Access Token
		String accessTokenResponse = given().urlEncodingEnabled(false).queryParams("code", code)
				.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
				.queryParams("grant_type", "authorization_code").when()
				.post("https://www.googleapis.com/oauth2/v4/token").then().log().all().extract().response().asString();

		JsonPath jp = new JsonPath(accessTokenResponse);
		String accessToken = jp.getString("access_token");

		// Main Request to get Courses
		String response = given().queryParam("access_token", accessToken).when()
				.get("https://rahulshettyacademy.com/getCourse.php").then().log().all().assertThat().statusCode(200).extract()
				.response().asString();
		System.out.println(response);
	}

}
