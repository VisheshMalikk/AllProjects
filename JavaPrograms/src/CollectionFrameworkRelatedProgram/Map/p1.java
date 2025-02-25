package CollectionFrameworkRelatedProgram.Map;

public class p1 {

	public static void main(String[] args) {

		String s = "I Love Dog";
		String s2 = s.toLowerCase().replace(" ", "");

		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (i != j && s2.charAt(i) != s2.charAt(j)) {
					System.out.print(s2.charAt(i) + "" + s2.charAt(j) + " ");
				}
			}
			System.out.println();
		}
	}
}
