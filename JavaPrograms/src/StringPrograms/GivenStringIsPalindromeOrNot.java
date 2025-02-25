package StringPrograms;

public class GivenStringIsPalindromeOrNot {

	public static void main(String[] args) {
		
		String str = "naman";
		String revStr = "";
		char[] strArray = str.toCharArray();
		
		for (int i = strArray.length-1; i >= 0 ; i--) {
			revStr = revStr + str.charAt(i);
		}
		
		System.out.println(revStr);
		
		if (str.equals(revStr)) {
			System.out.println(str + " is a Palindrome String");
		} else {
			System.out.println(str + " : is not a Palindrome String");
		}
	}

}
