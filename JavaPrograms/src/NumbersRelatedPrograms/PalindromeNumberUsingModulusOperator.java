package NumbersRelatedPrograms;

import java.util.Scanner;

public class PalindromeNumberUsingModulusOperator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}

		scanner.close();
	}

	public static boolean isPalindrome(int num) {
		int originalNumber = num;
		int reversedNumber = 0;

		// Reverse the number
		while (num != 0) {
			int remainder = num % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			num = num/10;
		}

		// Check if original number and reversed number are the same
		return originalNumber == reversedNumber;
	}

}
