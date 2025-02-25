package CollectionFrameworkRelatedProgram.Map;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountOfEachCharInString {

	public static void main(String[] args) {

		String name = "vishesh malik";

		char[] nameChar = name.toCharArray();

		System.out.println(Arrays.toString(nameChar));

		Map<Character, Integer> map = new TreeMap<Character, Integer>();

		for (char c : nameChar) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " --> " + entry.getValue());
			}
		}
	}

}
