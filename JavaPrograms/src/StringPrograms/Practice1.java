package StringPrograms;

public class Practice1 {

	public static void main(String[] args) {
		
		String profile = "Automation Test Engineer";
		
		String replacedStr = profile.toLowerCase().replace("e", "");
		
		System.out.println("Initial String : " + profile);
		
		int charCount = (profile.length() - replacedStr.length());
		
		System.out.println("No of 'e' char occurence : " + charCount);

	}

}
