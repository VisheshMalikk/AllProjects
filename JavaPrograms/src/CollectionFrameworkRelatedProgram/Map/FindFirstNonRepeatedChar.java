package CollectionFrameworkRelatedProgram.Map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedChar {

	public static void main(String[] args) {

		// First Non repeating character
		String s = "Prashant Chaudhary";
		
		char[] arr = s.toLowerCase().toCharArray();
		System.out.println(Arrays.toString(arr));
		char nonRepeatedChar = getFirstNonRepeatedChar(arr);
		System.out.println("The first non repeated character in the String is : " + nonRepeatedChar);
	}

	public static Character getFirstNonRepeatedChar(char[] arr) {
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : arr) {
			if (c != ' ') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}

		System.out.println("Map after put keys and its value : " + map);

		for (Map.Entry<Character, Integer> value : map.entrySet()) {
			if (value.getValue() == 1) {
				return value.getKey();
			}
		}
		return null;
	}
}
