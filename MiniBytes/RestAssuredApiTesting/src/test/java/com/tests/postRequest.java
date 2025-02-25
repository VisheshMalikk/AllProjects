package com.tests;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postRequest {
	
	
	// First Approach
	@Test(enabled = true)
	public void createEmployee() {
		// Passing JSON body as string ---> Not recommended 
		// First way to make a POST request but it's not a good way
		Response response = given()
				.header("Content-Type", "application/json")
				.body("{\r\n"
						+ "        \"id\": 222,\r\n"
						+ "        \"first_name\": \"Senu\",\r\n"
						+ "        \"last_name\": \"Sharma\",\r\n"
						+ "        \"email\": \"senu@gmail.com\"\r\n"
						+ "    }")
				.log()
				.all()
				.post("http://localhost:3000/employees");
		
		response.prettyPrint();
		System.out.println("Status Code is :" + response.getStatusCode());
		
	}
	
	
	
	// Second approach
	@Test(enabled = false)
	public void createEmploye() {
		// Now this time will pass JSON Data from an external file
		// You cannot get the request content from the file and print it on the console 
		// Use this only for static data 
		Response response = given()
				.header("Content-Type", ContentType.JSON)
				.body(new File(System.getProperty("user.dir")+"/TestData.json"))
				.log() 
				.all()
				.post("http://localhost:3000/employees");
		
		response.prettyPrint();
		System.out.println("Status Code is : " + response.getStatusCode());
	}
	
	// Third Approach
	// Now we will read request body from External file and convert to String
	// Logs the request body into the console
	// Use for some dynamic parameters changes or change few parameters in the request
	// Not suitable for request having lot of dynamic parameters
	@Test(enabled = false)
	public void createEmp() throws IOException {
		
		// Below line will read our Request Body content bytes by bytes and will store it in the form of bytes
		//byte[] bytes = Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"/TestData.json"));
		
		// Now converting bytes into String or without creating local variable , directly pass to String 
		String reqBody = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"/TestData.json")));
		String rep = reqBody.replace("765", String.valueOf(new Faker().number().numberBetween(100, 2000)))
				.replace("fname", new Faker().name().firstName());
					
		Response response = given()
				.header("Content-Type", ContentType.JSON)
				.body(rep)
				.log() 
				.all()
				.post("http://localhost:3000/employees");
		
		response.prettyPrint();
		System.out.println("Status Code is : " + response.getStatusCode());
	}
	
	
	
	

}
