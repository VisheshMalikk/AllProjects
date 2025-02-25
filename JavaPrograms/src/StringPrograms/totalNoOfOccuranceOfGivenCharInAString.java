package StringPrograms;

public class totalNoOfOccuranceOfGivenCharInAString {
	
	public static void main(String[] args) {
		
		fn1WithoutForLoop("Vishesh Malik Automation Test Engineer");
		
	}
	
	public static void fn1WithoutForLoop(String str) {
		
		String toLowerCase = str.toLowerCase();
		
		System.out.println(toLowerCase.replace("a", ""));
		int countOfChar = toLowerCase.length() - toLowerCase.replace("a", "").length();
		System.out.println("Number of occurances of 'a' in "+str+" = " + countOfChar);
	}
	

}
