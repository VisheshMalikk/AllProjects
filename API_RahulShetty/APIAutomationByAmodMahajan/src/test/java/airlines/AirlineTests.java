package airlines;

import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import restUtils.RestUtils;

public class AirlineTests {

	@Test
	public void createAirline() {
		// We have multiple ways to create a JSON body : by using String, Map, JSONObject, JSONArray, JSONFile
		String endpoint = "https://api.instantwebtools.net/v1/airlines";
		Map<String, Object> payload = Payloads.getCreateAirlinePayloadUsingMap("0201210", "Indian Airlines", "India", "IND", "Going Places Together", "New Delhi", "www.indianairways.com", "1978");
		Response response = RestUtils.performPostRequest(endpoint, payload, new HashMap<>());
		Assert.assertEquals(response.statusCode(), 200);
		
		// How to maintain endpoint : one way to store in separate Json file as key value pair
		// Now we need a utility to read value from this file for that we use Map for Key and Value
		// So for any Json file if we need to read that file  we need a utility that is a part of the framework
		
	}
}
