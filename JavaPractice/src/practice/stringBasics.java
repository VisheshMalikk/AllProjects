package practice;

import java.text.SimpleDateFormat;

public class stringBasics {

	public static void main(String[] args) {
		
		String timeStamp = new SimpleDateFormat("MM/dd/yyy KK:mm a").format(new java.util.Date());
		System.out.println(timeStamp);
		
		
		String s = "convert to automation";
		String rev = "";
		
		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i) + rev;
		}
		
		System.out.println(rev);
		
		
		
	}

}
