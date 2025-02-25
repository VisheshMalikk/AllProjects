package TestingBySriniSir;

import static io.restassured.RestAssured.given;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
//import io.restassured.internal.support.FileReader;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.RequestSpecification;

public class AddRequest {
	static int rid;

	@Test(enabled = false)
	public void Re1() {
		Response res = RestAssured.get("https://reqres.in/api/users/");
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		System.out.println("Status Code is : " + statusCode);
	}

	@Test(enabled = false)
	public void Re2() {
		Response res = given().redirects().follow(false).get("http://www.google.com/");
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 301);
		System.out.println("Status Code is : " + statusCode);
	}

	@Test(enabled = false)
	public void Re3() {
		Response res = given().redirects().follow(false).get("http://www.cnn.com/");
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		System.out.println("Status Code is : " + statusCode);
	}

	@Test(enabled = false)
	public void Re4() {
		Response res = RestAssured.get("http://www.googl.com/a");
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		System.out.println("Status Code is : " + statusCode);
	}

	@Test(enabled = false)
	public void Re5() {
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(response.statusCode());
		System.out.println(response.asString());
		System.out.println(response.getHeaders());
		String conn = response.getHeader("Connection");
		System.out.println(response.getBody().asString());
		System.out.println(response.statusLine());
		Assert.assertEquals(response.jsonPath().getInt("data.id"), 2);
		Assert.assertEquals(response.jsonPath().getString("data.first_name"), "Janet");
		Assert.assertEquals(conn, "keep-alive");
	}

	@Test(enabled = false)
	public void Re6() {
		RestAssured.baseURI = "https://reqres.in";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		FilterableRequestSpecification httpRequest = (FilterableRequestSpecification) RestAssured.given();

		// Make a request to the server by specifying the method Type and the method
		// URL.
		// This will return the Response from the server. Store the response in a
		// variable.
		Response response = httpRequest.request(Method.GET, "/api/users/2");
		System.out.println(response.statusCode());
		System.out.println(response.asString());
		System.out.println(response.getHeaders());
		System.out.println(response.getBody().asString());
		System.out.println(response.statusLine());
		Assert.assertEquals(response.jsonPath().getInt("data.id"), 2);
		Assert.assertEquals(response.jsonPath().getString("data.last_name"), "Weaver");
	}

	@Test(enabled = false)
	public void Re7() {
		given().redirects().follow(false).when().get("http://cnn.com").then().assertThat().statusCode(301);
	}

	@Test(enabled = false)
	public void Re8() {
		given().when().get("https://httpbin.org/basic-auth/scott/tiger").then().assertThat().statusCode(401);
	}

	@Test(enabled = false)
	public void Re9() {
		given().auth().basic("scott", "tiger").when().log().all().get("https://httpbin.org/basic-auth/scott/tiger")
				.then().assertThat().statusCode(200).log().all();
	}

	@Test(enabled = false)
	public void R10() {
		JSONObject request = new JSONObject();
		request.put("name", "Srini");
		request.put("job", "BAAA");

		System.out.println(request);
		System.out.println(request.toString());

		given().body(request.toJSONString()).log().all().when().post("https://reqres.in/api/users").then()
				.statusCode(201).log().all();
	}

	@Test(enabled = false)
	public void R11() {
		JSONObject request = new JSONObject();
		request.put("name", "Srini");
		request.put("job", "BAAA");

		System.out.println(request);
		System.out.println(request.toString());

		given().body(request.toJSONString()).log().all().header("content-type", "application/json").when()
				.post("https://reqres.in/api/users").then().statusCode(201).log().all();
	}

	@Test(enabled = false)
	public void R12() {
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://reqres.in";

		JSONObject JsonObj = new JSONObject();
		JsonObj.put("name", "Sri");
		JsonObj.put("job", "leader");

		RequestSpecification httpRequest = RestAssured.given();

		httpRequest.header("Content-Type", "application/json");
		// httpRequest.body(JsonObj.toString());
		httpRequest.body(JsonObj.toString());
		// Make a request to the server by specifying the method Type and the method
		// URL.
		// This will return the Response from the server. Store the response in a
		// variable.
		Response response = httpRequest.request(Method.POST, "/api/users");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		System.out.print(response.getStatusCode());
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		String rid = response.jsonPath().get("name");
		System.out.println(rid);
		Assert.assertEquals(rid, "Sri");
	}

	@Test(enabled = false)
	public void R13() {
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		JSONObject JsonObj = new JSONObject();

		JsonObj.put("title", "namw1");
		JsonObj.put("body", "restA");
		JsonObj.put("userid", 111);

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();

		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(JsonObj.toString());

		// Make a request to the server by specifying the method Type and the method
		// URL.
		// This will return the Response from the server. Store the response in a
		// variable.
		Response response = httpRequest.request(Method.PUT, "/posts/3");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Test(enabled = false)
	public void R14() {

		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		JSONObject JsonObj = new JSONObject();

		JsonObj.put("title", "Malik");
		// JsonObj.put("body", "restA");
		// JsonObj.put("userid", 111);

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();

		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(JsonObj.toString());

		// Make a request to the server by specifying the method Type and the method
		// URL.
		// This will return the Response from the server. Store the response in a
		// variable.
		Response response = httpRequest.request(Method.PATCH, "/posts/3");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Test(enabled = false)
	public void R15() {
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://reqres.in";

		// JSONObject JsonObj = new JSONObject();

		// JsonObj.put("id", 1731);

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();

		// httpRequest.header("Content-Type","application/json");
		// httpRequest.body(JsonObj.toString());

		// Make a request to the server by specifying the method Type and the method
		// URL.
		// This will return the Response from the server. Store the response in a
		// variable.
		Response response = httpRequest.request(Method.DELETE, "/api/users/2");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		Assert.assertEquals(response.getStatusCode(), 200);

		// In output we will get 204 COde there is not content

	}

	// Below example of ----- Use of one API output to another API as Input

	@Test(enabled = false)
	public void test() {

		Response response = RestAssured.get("https://reqres.in/api/users/7");
		System.out.println(response.statusCode());
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.statusLine());
		rid = response.jsonPath().get("data.id");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

	}

	@Test(enabled = false)
	public void test2() {

		Response response = RestAssured.get("https://postman-echo.com/get?fname=" + AddRequest.rid);
		System.out.println(response.statusCode());
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.statusLine());
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

	}

	// Below example - is for Data Provider like CSV in Postman

	@DataProvider(name = "coun")
	public String[][] createMD5TestData() {
		return new String[][] { { "1" }, { "3" }, { "5" } };
	}

	@Test(dataProvider = "coun", enabled = false)
	public void getData(String originalText) {

		given().then().log().all().when().get("https://reqres.in/api/users/" + originalText).then().statusCode(200);
	}

	@DataProvider(name = "md5hashes")
	public String[] createMD5TestData1() {
		String line = "";
		String splitBy = ",";
		int index = 0;
		String[] employee = new String[7];
		try {
			// parsing a CSV file into BufferedReader class constructor
			BufferedReader br = new BufferedReader(new FileReader(
					"C:\\AutomationPractice\\MiniBytes\\RestAssuredApiTesting\\src\\test\\java\\TestDataFileBySrini.txt"));
			while ((line = br.readLine()) != null) // returns a Boolean value
			{
				employee[index] = line; // use comma as separator
				// System.out.println("[text=" + employee[index][0] + ", MD5=" +
				// employee[index][1] );
				index++;
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return employee;

	}

	@Test(dataProvider = "md5hashes")
	public void getData1(String cname) {
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "http://reqres.in/api/users";
		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		// Make a request to the server by specifying the method Type and the method
		// URL.
		// This will return the Response from the server. Store the response in a
		// variable.
		Response response = httpRequest.request(Method.GET, "/" + cname);
		// Now let us print the body of the message to see what response
		// we have recieved from the server
		System.out.println("Response Body is =>  " + response.getBody().asString());
		// String responseBody = response.jsonPath().get("md5");
		// Assert.assertEquals(responseBody,md5Hash);

	}
}
