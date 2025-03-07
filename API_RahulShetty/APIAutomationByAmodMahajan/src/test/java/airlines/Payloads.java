package airlines;

import java.util.HashMap;
import java.util.Map;

public class Payloads {
	
	// Using Map
	public static String getCreateAirlinePayloadUsingString(String id, String name, String country, String logo, String slogan, String head_quaters, String website, String established) {
		String payload = "{\r\n"
				+ "    \"_id\":\""+id+"\",\r\n"
				+ "    \"name\": \""+name+"\",\r\n"
				+ "    \"country\": \""+country+"\",\r\n"
				+ "    \"logo\": \""+logo+"\",\r\n"
				+ "    \"slogan\": \""+slogan+"\",\r\n"
				+ "    \"head_quaters\": \""+head_quaters+"\",\r\n"
				+ "    \"website\": \""+website+"\",\r\n"
				+ "    \"established\": \""+established+"\"\r\n"
				+ "}";
		return payload;
	}
	
	// Using Map
	public static Map<String, Object> getCreateAirlinePayloadUsingMap(String id, String name, String country, String logo, String slogan, String head_quaters, String website, String established) {
		Map<String, Object> payload = new HashMap<>();
		payload.put("_id", id);
		payload.put("name", name);
		payload.put("country", country);
		payload.put("logo", logo);
		payload.put("slogan", slogan);
		payload.put("head_quaters", head_quaters);
		payload.put("website", website);
		payload.put("established", established);
		return payload;
	}
}
