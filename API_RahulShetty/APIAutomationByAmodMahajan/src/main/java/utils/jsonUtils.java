package utils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonUtils {
	
	public static Map<String, String> getJsonDataAsMap(String jsonFileName) throws IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		String completeJsonFilePath = System.getProperty("user.dir") + "/src/test/resources/" + jsonFileName;
		
		// So to read a json file we need Jackson so in Jackson we have a clas ObjectMapper
		objectMapper.readValue(new File(completeJsonFilePath), new TypeReference<Object>(){});
		return null;
		
	}

}
