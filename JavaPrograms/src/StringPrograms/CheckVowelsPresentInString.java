package StringPrograms;

public class CheckVowelsPresentInString {

	public static void main(String[] args) {
		System.out.println(stringContainsVowels("vi"));
	}

	public static boolean stringContainsVowels(String input) {							
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}
