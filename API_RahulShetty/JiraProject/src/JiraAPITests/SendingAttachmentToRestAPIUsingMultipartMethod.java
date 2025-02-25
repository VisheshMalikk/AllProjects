package JiraAPITests;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.reuseableMethods;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class SendingAttachmentToRestAPIUsingMultipartMethod {
	String issueId = null;

	@Test
	public void sendAttachment() throws IOException {
		RestAssured.baseURI = "http://localhost:8080";
		SessionFilter session = new SessionFilter();
		// Creating session with Session Filter method
		// relaxedHTTPSValidation() :  This method is used to bypass SSL certificate validation when making API requests over HTTPs.
		String sessionResponse = given().relaxedHTTPSValidation().log().all().header("Content-Type", "application/json")
				.body("{ \"username\": \"Vishesh\", \"password\": \"1@Hanuman2345\" }").filter(session).when()
				.post("/rest/auth/1/session").then().assertThat().statusCode(200).extract().response().asString();
		System.out.println("Session creation response : " + sessionResponse);

		System.out.println("------------------------------- Session Created ----------------------------");

		// Creating an issue
		HashMap<String, String> map = new HashMap<String, String>();
		String response = given().log().all().header("Content-Type", "application/json")
				.body(new String(Files.readAllBytes(Paths.get("C:\\AutomationPractice\\API_RahulShetty\\JiraProject\\resources\\JiraCreateIssue.json"))))
				.filter(session).when().post("/rest/api/2/issue").then().assertThat().statusCode(201).extract().response().asString();
		System.out.println("Create Issue response is :" + response);
		JsonPath js = reuseableMethods.rawToJson(response);
		issueId = js.getString("id");
		System.out.println("Issue ID is : " + issueId);
//
//		System.out.println("------------------------------- Issue Created ----------------------------");

		// Adding comment to an issue using Add Comment API :
		String myComment = "Hey , Pega team, its working now";
		String commentResponse = given().log().all().pathParam("key", "10122").header("Content-Type", "application/json")
				.body(Files.readAllBytes(Paths.get("C:\\AutomationPractice\\API_RahulShetty\\JiraProject\\resources\\JiraAddComment.json")))
				.filter(session).when().post("/rest/api/2/issue/{key}/comment").then().log().all().assertThat().statusCode(201)
				.extract().response().asString();
		System.out.println("Comment Added :" + commentResponse);
		JsonPath js2 = new JsonPath(commentResponse);
		String commentID = js2.getString("id");
		

		System.out.println("-------------------------------- Comment Added -------------------------------");

		// Add Attachment to an existing issue using Add Attachment API :
		given().log().all().pathParam("key", "10122").header("X-Atlassian-Token", "no-check")
				.header("Content-Type", "multipart/form-data")
				.multiPart("file",new File("C:\\AutomationPractice\\API_RahulShetty\\JiraProject\\resources\\Attach.txt"))
				.filter(session).when().post("/rest/api/2/issue/{key}/attachments").then().log().all().assertThat()
				.statusCode(200).extract().response().asString();

//		System.out.println("----------------------------- Attachment attached ----------------------------");

		// Get details of an existing Issue using get issue API :
		String issueDetails = given().pathParam("key", "10122").queryParam("fields", "comment").log().all().filter(session).when()
				.get("/rest/api/2/issue/{key}").then().log().all().extract().asString();
		System.out.println("Issue details are : " + issueDetails);

		System.out.println("----------------------------- Issue details fetched ----------------------------");
		
		// Find out specific comment from the response JSON
		JsonPath js1 = new JsonPath(issueDetails);
		int commentsCount = js1.getInt("fields.comment.comments.size()");
		for (int i = 0; i < commentsCount; i++) {
			String commentIdIssue = js1.get("fields.comment.comments["+i+"].id").toString();
			if(commentIdIssue.equalsIgnoreCase(commentID)) {
				String commentBody = js1.get("fields.comment.comments["+i+"].body").toString();
				System.out.println(commentBody);
				Assert.assertEquals(commentBody, myComment);
				System.out.println("PASS : VALIDATED THE SPECIFIC COMMENT");
			}
		}
	}

}
