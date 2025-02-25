package JSONObjectParsing;

import org.json.JSONArray;
import org.json.JSONObject;

public class P1 {

	public static void main(String[] args) {

		String jsonString = "{ \r\n" + "  \"accounting\" : [   \r\n"
				+ "                     { \"firstName\" : \"John\",  \r\n"
				+ "                       \"lastName\"  : \"Doe\",\r\n"
				+ "                       \"age\"       : 23 },\r\n" + "\r\n"
				+ "                     { \"firstName\" : \"Mary\",  \r\n"
				+ "                       \"lastName\"  : \"Smith\",\r\n"
				+ "                        \"age\"      : 32 }\r\n"
				+ "                 ],                            \r\n" + "  \"sales\"      : [ \r\n"
				+ "                     { \"firstName\" : \"Sally\", \r\n"
				+ "                       \"lastName\"  : \"Green\",\r\n"
				+ "                        \"age\"      : 27 },\r\n" + "\r\n"
				+ "                     { \"firstName\" : \"Jim\",   \r\n"
				+ "                       \"lastName\"  : \"Galley\",\r\n"
				+ "                       \"age\"       : 41 }\r\n" + "                 ] \r\n" + "} ";

		JSONObject obj = new JSONObject(jsonString);
		
		System.out.println(obj.length());
		int age = 0;
		
		JSONArray arr1 = obj.getJSONArray("accounting");
		JSONArray arr2 = obj.getJSONArray("sales");
		
		int n1 = arr1.length();
		int n2 = arr2.length();
		
		for (int i = 0; i < n1; i++) {
			String fName = arr1.getJSONObject(i).getString("firstName");
			if (fName.equals("Mary")) {
				age = arr1.getJSONObject(i).getInt("age");
			}
		}
		System.out.println(age);
	}

}
