package JSONObjectParsing;

import org.json.JSONArray;
import org.json.JSONObject;

public class P2 {

	public static void main(String[] args) {

		String payload = "[\r\n" + "  {\r\n" + "    \"id\": \"A1\",\r\n" + "    \"name\": \"Jim\",\r\n"
				+ "    \"math\": 60,\r\n" + "    \"physics\": 66,\r\n" + "    \"chemistry\": 61\r\n" + "  },\r\n"
				+ "  {\r\n" + "    \"id\": \"A2\",\r\n" + "    \"name\": \"Dwight\",\r\n" + "    \"math\": 89,\r\n"
				+ "    \"physics\": 76,\r\n" + "    \"chemistry\": 51\r\n" + "  },\r\n" + "  {\r\n"
				+ "    \"id\": \"A3\",\r\n" + "    \"name\": \"Kevin\",\r\n" + "    \"math\": 79,\r\n"
				+ "    \"physics\": 90,\r\n" + "    \"chemistry\": 78\r\n" + "  }\r\n" + "]";

		JSONArray jsonArray = new JSONArray(payload);

		System.out.println(jsonArray.length());
		
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			if(jsonObject.getString("id").equals("A3")) {
				int marks = jsonObject.getInt("physics");
				System.out.println(marks);
			}
		}

	}

}
