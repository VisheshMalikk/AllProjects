package NumbersRelatedPrograms;

public class RemoveLeadingZerosFromNumber {

	public static void main(String[] args) {

		String newStr = removeLeadingZeros("0076543");
		System.out.println("Without leading zeros number : " + newStr);
	}

	static String removeLeadingZeros(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '0') {
				return str.substring(i).trim();
			}
		}
		return str;

	}

}
