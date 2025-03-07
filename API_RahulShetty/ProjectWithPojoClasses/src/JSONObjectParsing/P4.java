package JSONObjectParsing;

import org.json.JSONObject;

public class P4 {

	public static void main(String[] args) {

		String payload = "{\r\n" + "    \"school_name\": \"Dunder Miflin\",\r\n" + "    \"class\": \"Year 1\",\r\n"
				+ "    \"info\": {\r\n" + "      \"president\": \"Michael Scott\",\r\n"
				+ "      \"address\": \"Scranton, Pennsylvania\",\r\n" + "      \"contacts\": {\r\n"
				+ "        \"email\": \"admin@e.com\",\r\n" + "        \"tel\": \"123456789\"\r\n" + "      }\r\n"
				+ "    },\r\n" + "    \"students\": [\r\n" + "    {\r\n" + "        \"id\": \"A1\",\r\n"
				+ "        \"name\": \"Jim\",\r\n" + "        \"math\": 60,\r\n" + "        \"physics\": 66,\r\n"
				+ "        \"chemistry\": 61\r\n" + "    },\r\n" + "    {\r\n" + "        \"id\": \"A2\",\r\n"
				+ "        \"name\": \"Dwight\",\r\n" + "        \"math\": 89,\r\n" + "        \"physics\": 76,\r\n"
				+ "        \"chemistry\": 51\r\n" + "    },\r\n" + "    {\r\n" + "        \"id\": \"A3\",\r\n"
				+ "        \"name\": \"Kevin\",\r\n" + "        \"math\": 79,\r\n" + "        \"physics\": 90,\r\n"
				+ "        \"chemistry\": 78\r\n" + "    }]\r\n" + "}";

		JSONObject object = new JSONObject(payload);
		
		JSONObject infoObj = object.getJSONObject("info");
		
		JSONObject contactObj = infoObj.getJSONObject("contacts");
		
		String email = contactObj.getString("email");
		
		System.out.println(email);
	}

}
