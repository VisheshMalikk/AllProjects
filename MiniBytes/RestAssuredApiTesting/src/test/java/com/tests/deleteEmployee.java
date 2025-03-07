package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteEmployee {
	
	@Test
	  public void deleteBook() {
		  RestAssured.baseURI = "http://localhost:3000/employees";
		  RequestSpecification httpRequest = RestAssured.given()
			         .header("Content-Type", "application/json");
		 
		  //Calling the Delete API with request body
		  Response res = httpRequest.delete("/employees/1");
	 
		  //Fetching the response code from the request and validating the same
		  System.out.println("The response code is - " +res.getStatusCode());
	      Assert.assertEquals(res.getStatusCode(),204);
   
	  }

}
