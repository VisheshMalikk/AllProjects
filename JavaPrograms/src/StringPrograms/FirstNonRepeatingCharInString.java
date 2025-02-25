package StringPrograms;

import java.util.Scanner;

public class FirstNonRepeatingCharInString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input a String:");
		String word = s.next().toLowerCase();
		boolean flag = false;
		char[] strChar = word.toCharArray();

		// The lastIndexOf() method returns the position of the last occurrence of specified character(s) in a string.
		for (char a : strChar) {
			if (word.indexOf(a) == word.lastIndexOf(a)) {
				System.out.println("The first character which is not repeating is: " + a);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("There is no non-repeating character in the input string");
		}

	}

}
