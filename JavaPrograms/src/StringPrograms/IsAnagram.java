package StringPrograms;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {

		boolean ana = IsAnagrmOrNot("abcd", "bcad");
		System.out.println(ana);

	}

	public static boolean IsAnagrmOrNot(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);

		boolean f = Arrays.equals(c1, c2) == true ? true : false;
		
		return f;
	}

}
