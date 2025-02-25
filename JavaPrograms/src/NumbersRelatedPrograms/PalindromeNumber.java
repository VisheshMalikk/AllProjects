package NumbersRelatedPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		boolean bol = isPalindrome(9);
		System.out.println(bol);
	}

	public static boolean isPalindrome(int x) {
		String originalString = Integer.toString(x);
		String reversedString = "";

		for (int i = originalString.length() - 1; i >= 0; i--) {
			reversedString = reversedString + originalString.charAt(i);
		}

		if (originalString.equals(reversedString)) {
			return true;
		} else {
			return false;
		}

	}

}
