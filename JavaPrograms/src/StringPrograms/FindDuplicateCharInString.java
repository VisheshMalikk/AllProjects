package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharInString {

	public static void main(String[] args) {
		
		fnFindDuplicateCharInString("hgrtdfffgdsaaaiiiiii");

	}
	
	
	public static void fnFindDuplicateCharInString(String str) {
		HashMap<Character, Integer> mapCount = new HashMap<Character, Integer>();
		
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if(mapCount.containsKey(c)) {
				mapCount.put(c, mapCount.get(c) + 1);
			} else {
				mapCount.put(c, 1);
			}
		}
		System.out.println(mapCount);
		for(Map.Entry<Character, Integer> item : mapCount.entrySet()) {
			if(item.getValue() >=2) {
				System.out.println(item.getKey());
			}
		}
	}

}
