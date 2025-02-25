package files;

public class jsonPayload {
	
	
	
	public static String addBookPayload(String isbnNo, String aisleNo) {
	// I don't want to hard code isbn and aisle number in the Json payload so will pass from test
		String bookPayload =  "{\r\n"
				+ "\"name\":\"Learn Java by me\",\r\n"
				+ "\"isbn\":\""+isbnNo+"\",\r\n"
				+ "\"aisle\":\""+aisleNo+"\",\r\n"
				+ "\"author\":\"Seera Malik\"\r\n"
				+ "}";
		return bookPayload;
	}
	
	
	public static String deleteBookPayload(String ID) {
		return "{\r\n"
				+ " \r\n"
				+ "\"ID\" : \""+ID+"\"\r\n"
				+ " \r\n"
				+ "} \r\n"
				+ "";
	}
	

}
