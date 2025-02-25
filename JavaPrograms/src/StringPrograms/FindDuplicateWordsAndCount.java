package StringPrograms;

import java.util.HashMap;

public class FindDuplicateWordsAndCount {

	public static void main(String[] args) {
		
		fnFindDuplicateWords("Vishesh Malik Vishesh Malik Kumar");

	}
	
	
	public static void fnFindDuplicateWords(String inputString) {
		
		String[] words = inputString.split(" ");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for (String word : words) {
			if(wordCount.containsKey(word.toLowerCase())) {
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
			} else {
				wordCount.put(word.toLowerCase(), 1);
			}
		}
			
		System.out.println(wordCount);
		System.out.println("No of words in a string : " + words.length);
	}

}
