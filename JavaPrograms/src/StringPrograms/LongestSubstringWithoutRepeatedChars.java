package StringPrograms;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatedChars {

	public static void main(String[] args) {
		int a = lengthOfLongestSubstring("vivshevsh");
		System.out.println(a);
	}

	public static int lengthOfLongestSubstring(String s) {

		HashMap<Character, Integer> charToIndex = new HashMap<>();
		int maxLength = 0;
		int start = 0;

		for (int i = 0; i < s.length(); i++) {
			char next = s.charAt(i);
			if (charToIndex.containsKey(next) && charToIndex.get(next) >= start) {
				start = charToIndex.get(next) + 1;
			}
			charToIndex.put(next, i);
			maxLength = Math.max(maxLength, i - start + 1);
		}
		return maxLength;

	}

}
