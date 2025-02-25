package Tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.jsonPayload;
import files.reuseableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJsonBooksTest {
	String bookId = null;
	
	@Test(dataProvider="BooksData", enabled = true)
	public void addBook(String isbn, String aisle) {
		
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().log().all().header("Content-Type", "application/json")
		// Dynamically build JSON Payload with external data inputs
		.body(jsonPayload.addBookPayload(isbn, aisle))
		.when().post("Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println("Response of Add Book API is :" + response);
		JsonPath jp = reuseableMethods.rawToJson(response);
		
		
		
		//String bookId = jp.get("ID"); // both lines are same
		bookId = jp.getString("ID");
		System.out.println("Added Book ID is : " + bookId);
	}
	
	// Lets delete all books which are added above
	@Test(dataProvider="BooksData", enabled = false)
	public void deleteBook(String isbn, String aisle) {
		RestAssured.baseURI = "http://216.10.245.166";
		String rep = given().log().all().header("Content-Type", "application/json")
		.body(jsonPayload.deleteBookPayload(isbn+aisle)).when().delete("/Library/DeleteBook.php").then()
		.log().all().extract().response().asString();
		
		JsonPath jp = reuseableMethods.rawToJson(rep);
		
		System.out.println("Parsed JSON is :" + jp);
		
		String message = jp.getString("msg");
		System.out.println("Deleted book message : " + message);
		
	}	
	
	@DataProvider(name = "BooksData") // Now make connection for this BooksData into Test
	public Object[][] getData() {
		// Array : Collection of elements
		// MultiDimensional Array : Collection of Arrays
		return new Object[][] {{"trat", "3000"}};
	}
	
	
}
