package Utils;

import io.restassured.path.json.JsonPath;

public class reuseableMethods {
	
	public static JsonPath rawToJson(String response) {
		JsonPath path = new JsonPath(response);
		return path;
	}

}
