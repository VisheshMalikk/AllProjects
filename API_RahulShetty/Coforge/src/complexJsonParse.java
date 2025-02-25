import files.payload;
import io.restassured.path.json.JsonPath;

public class complexJsonParse {

	public static void main(String[] args) {
		
		JsonPath jp = new JsonPath(payload.courses());
		
//		1. Print No of courses returned by API
		int coursesCount = jp.getInt("courses.size()");
		System.out.println("Total No of courses : " + coursesCount);
//		2.Print Purchase Amount
		int purAmount = jp.getInt("dashboard.purchaseAmount");
		System.out.println("Total purchase amount : " + purAmount);
//		3. Print Title of the first course
		String firstCourseTitle = jp.getString("courses[0].title");
		//String title = jp.get("courses[0].title"); This will give by default String return type
		System.out.println("Title of the first course : " + firstCourseTitle);
//		4. Print All course titles and their respective Prices
		for (int i = 0; i < coursesCount; i++) {
			String title = jp.getString("courses["+i+"].title");
			// System.out.println() method always excepts String parameter so change to it string as below
			//System.out.println(jp.get("courses[0].price").toString());
			System.out.println("Title at index " +i+ " is : "  + title + " and price is : " + jp.getInt("courses["+i+"].price"));
		}
//		5. Print no of copies sold by RPA Course
		for (int i = 0; i < coursesCount; i++) {
			String title = jp.getString("courses["+i+"].title");
			if(title.equals("RPA")) {
				System.out.println("No of copies of " + title + " course : " + jp.getInt("courses["+i+"].copies"));
				break;
			}
		}
		

		
		
	}

}
