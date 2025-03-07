package JSONObjectParsing;

import org.json.JSONArray;
import org.json.JSONObject;

public class P3 {

	public static void main(String[] args) {

		String payload = "{\r\n" + "    \"school_name\": \"Dunder Miflin\",\r\n" + "    \"class\": \"Year 1\",\r\n"
				+ "    \"students\": [\r\n" + "    {\r\n" + "        \"id\": \"A1\",\r\n"
				+ "        \"name\": \"Jim\",\r\n" + "        \"math\": 60,\r\n" + "        \"physics\": 66,\r\n"
				+ "        \"chemistry\": 61\r\n" + "    },\r\n" + "    {\r\n" + "        \"id\": \"A2\",\r\n"
				+ "        \"name\": \"Dwight\",\r\n" + "        \"math\": 89,\r\n" + "        \"physics\": 76,\r\n"
				+ "        \"chemistry\": 51\r\n" + "    },\r\n" + "    {\r\n" + "        \"id\": \"A3\",\r\n"
				+ "        \"name\": \"Kevin\",\r\n" + "        \"math\": 79,\r\n" + "        \"physics\": 90,\r\n"
				+ "        \"chemistry\": 78\r\n" + "    }]\r\n" + "}";
		
		
		
		JSONObject obj = new JSONObject(payload);
		
		String schoolName = obj.getString("school_name");
		System.out.println(schoolName);
		
		JSONArray jsArray = obj.getJSONArray("students");
		
		for (int i = 0; i < jsArray.length(); i++) {
			String name = jsArray.getJSONObject(i).getString("name");
			if(name.equals("Kevin")) {
				int nums = jsArray.getJSONObject(i).getInt("physics");
				System.out.println(nums);
			}
		}
	}

}
