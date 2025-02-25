package Test;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import PojoClasses.AuthApiResponse;
import PojoClasses.Credientials;
import PojoClasses.OrderDetail;
import PojoClasses.Orders;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class EndToEndFlowTest {
	
	// This library used to convert Java Object to JSON (Serialization) and JSON to java (Deserialization) object : jackson-databind dependency

	@Test
	public void eCommerceEndToEndAPITest() {

		// Pojo Serializing here
		Credientials cred = new Credientials();
		cred.setUserEmail("Visheshmalikk@gmail.com");
		cred.setUserPassword("Hanuman2345");
		
		RequestSpecification reqLoginApiSpec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).build();
		ResponseSpecification resLoginApiSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		// Login into App with login API // relaxedHTTPSValidation : is used to bypass SSL Certification
		RequestSpecification response = given().relaxedHTTPSValidation().spec(reqLoginApiSpec).body(cred).log().all();
		AuthApiResponse loginAuthResponse=response. when().post("/api/ecom/auth/login").then().log().all().spec(resLoginApiSpec).extract().response().as(AuthApiResponse.class);
		String token = loginAuthResponse.getToken();
		String userId = loginAuthResponse.getUserId();
		System.out.println("JWT (JSON Web Token) Token value is : " + token);
		
		// -------------------------------------------------------------------------------------------------------------
		
		// Lets Add a product to E-Commerce platform
		RequestSpecification reqAddProductApiSpec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("authorization", token).build();
		
		RequestSpecification addProductResponse = given().log().all().spec(reqAddProductApiSpec)
		// Adding form Data
		.param("productName", "TDD")
		.param("productAddedBy", userId)
		.param("productCategory", "fashion")
		.param("productSubCategory", "shirts")
		.param("productPrice", 50)
		.param("productDescription", "Addias Originals")
		.param("productFor", "women")
		.multiPart("productImage", new File("C:\\Users\\Vishesh.1.Malik\\Downloads\\rt.jpg"));
		
		String responseAfterAddProduct = addProductResponse.when().post("/api/ecom/product/add-product")
		.then().extract().response().asString();
		// Creating JsonPath object
		JsonPath js = new JsonPath(responseAfterAddProduct);
		String productID = js.get("productId");
		System.out.println("Product ID is :" + productID);
		
		// --------------------------------------------------------------------------------------------------------------
		
		// Create Order/Purchase Order
		RequestSpecification reqPurchaseProductApiSpec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).addHeader("authorization", token).build();
		
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setCountry("India");
		orderDetail.setProductOrderedId(productID);
		
		List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
		orderDetailList.add(orderDetail);
		
		Orders orders = new Orders();
		
		orders.setOrders(orderDetailList);
		
		RequestSpecification purchaseOrderReq = given().log().all().spec(reqPurchaseProductApiSpec).body(orders);
		String purchaseOrderRes = purchaseOrderReq.when().post("/api/ecom/order/create-order").then().log().all().extract().asString();
		System.out.println("Purchase Order Response :" + purchaseOrderRes);
		
		// ------------------------------------------------------------------------------------------------------------------
		
		// Delete Product
		RequestSpecification reqDeleteProductApiSpec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("authorization", token).build();
		
		RequestSpecification deleteReqSpec = given().log().all().spec(reqDeleteProductApiSpec).pathParam("productId", productID);
		String deleteProductResponse = deleteReqSpec.when().delete("/api/ecom/product/delete-product/{productId}")
		.then().extract().response().asString();
		System.out.println("Deleted Product Response : " + deleteProductResponse);
	}

}
