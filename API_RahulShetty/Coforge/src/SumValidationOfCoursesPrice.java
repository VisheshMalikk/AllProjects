import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import files.payload;
import io.restassured.path.json.JsonPath;

public class SumValidationOfCoursesPrice {
	
	
	@Test
	public void sumValidation() {
//		6. Verify if Sum of all Course prices matches with Purchase Amount
		int price = 0;
		SoftAssert softAssert = new SoftAssert();
		JsonPath jp = new JsonPath(payload.courses());
		int coursesCount = jp.getInt("courses.size()");
		for (int i = 0; i < coursesCount; i++) {
			int perCoursePrice = jp.getInt("courses["+i+"].price");
			int totalCopiesEachCourse = jp.getInt("courses["+i+"].copies");
			int totalPrice = perCoursePrice * totalCopiesEachCourse;
			price = price + totalPrice;
		}
		System.out.println("Total price of all courses is :" + price);
		int totalPurchaseAmount = jp.getInt("dashboard.purchaseAmount");
		softAssert.assertEquals(price, totalPurchaseAmount, "Total Amount is not matching for courses");
		System.out.println("Total Amount is matching for the courses");
		softAssert.assertAll();;
	}
}
