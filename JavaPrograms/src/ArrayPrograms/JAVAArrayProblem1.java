package ArrayPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class JAVAArrayProblem1 {

	public static void main(String[] args) {


		String s = "Ram and Hanuman ji";

		String s1 = s.toLowerCase();

		char[] gods = s1.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : gods) {
			if (c != ' ') {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
		}
		for (Map.Entry<Character, Integer> it : map.entrySet()) {
			System.out.println("Key is : " + it.getKey() + " and value is : " + it.getValue());
		}
	}

}
