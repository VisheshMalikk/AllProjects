package JiraAPITests;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import serializationPojos.AddPlace;
import serializationPojos.Location;


public class SerializationTestWithGoogleAPI {
	
	@Test
	public void addPlace() {
		AddPlace ap = new AddPlace();
		ap.setAccuracy(50);
		ap.setAddress("29, side layout, cohen 09");
		ap.setLanguage("French-IN");
		ap.setName("Frontline house");
		ap.setPhone_number("(+91) 983 893 3937");
		ap.setWebsite("http://google.com");
		List<String> myList = new ArrayList<>();
		myList.add("shoe park");
		myList.add("shop");
		ap.setTypes(myList);
		Location loc = new Location();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		
		ap.setLocation(loc);
		
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String resp = given().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(ap).log().all()
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println(resp);
	}
	

}
