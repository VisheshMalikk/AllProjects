package CollectionFrameworkRelatedProgram.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNon {

	public static void main(String[] args) {
		
		String s = "Pprashant Chaudhary";
		char[] arr = s.toLowerCase().toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (char c : arr) {
			if(c != ' ') {
				if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				} else {
					map.put(c, 1);
				}
			}
		}
		
		for (Map.Entry<Character, Integer> value : map.entrySet()) {
			if(value.getValue() == 1) {
				System.out.println(value.getKey());
				break;
			}
		}

	}

}
