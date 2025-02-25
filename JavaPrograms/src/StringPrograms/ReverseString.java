package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String n = "Vishesh Malik";
		String rev = "";
		
		 for (int i = n.length()-1 ; i >= 0; i--) {
			rev = rev + n.charAt(i);
		}
		System.out.println(rev);
	}

}
