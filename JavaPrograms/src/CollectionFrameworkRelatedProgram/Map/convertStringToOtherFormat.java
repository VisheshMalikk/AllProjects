package CollectionFrameworkRelatedProgram.Map;

import java.util.HashMap;
import java.util.Map;

public class convertStringToOtherFormat {

	public static void main(String[] args) {

		String s = "aabcccdaabb";
		String r = "";

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

		System.out.println(map);

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			r = r + e.getKey() + e.getValue();
		}
		System.out.println("Result string is : " + r);
	}

}
