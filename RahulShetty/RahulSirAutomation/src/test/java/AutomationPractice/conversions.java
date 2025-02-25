package AutomationPractice;

import java.util.Arrays;

public class conversions {

	public static void main(String[] args) {
		
		// Static Array
		String[] agencies = {"NASA", "ISRO", "JAXA"};
		// Converting Array to List with the help of asList() method
		//List<String> agencies = Arrays.asList(names);
		Arrays.asList(agencies);
		for(String agency : agencies) { 
		System.out.println(agency);
		}

	}

}
