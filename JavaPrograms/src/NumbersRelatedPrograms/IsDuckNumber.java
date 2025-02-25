package NumbersRelatedPrograms;

public class IsDuckNumber {

	public static void main(String[] args) {
		
		int number = 1230;
		if (isDuckNumber(number)) {
			System.out.println("It is a Duck Number");
		} else {
			System.out.println("It is not a Duck Number");
		}

	}

	public static boolean isDuckNumber(int number) {
		String num = Integer.toString(number);
		boolean hasZero = false;
		
		for (int i = 1; i < num.length(); i++) {
			if (num.charAt(i) == '0') {
				hasZero = true;
				break;
			}
		}
		return (hasZero && num.charAt(0) != '0');
	}

}
