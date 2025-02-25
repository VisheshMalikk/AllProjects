package StringPrograms;

import java.util.Scanner;

public class AllPossibleCombinationOfString {
	
	public static void generateCombinations(String prefix, String str) {
		if(!prefix.isEmpty()) {
			System.out.println(prefix);
		}
		
		for (int i = 0; i < str.length(); i++) {
			generateCombinations(prefix + str.charAt(i), str.substring(i + 1));
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		System.out.println("All possible combinations of the string : ");
		
		generateCombinations("", input);
		
		scanner.close();
	}

}
