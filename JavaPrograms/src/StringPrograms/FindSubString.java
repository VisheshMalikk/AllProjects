package StringPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindSubString {

	public static void main(String[] args) {
		
		String s = "VisheshVignesh";
		
		List<String> substrings = new ArrayList<>();
		
		int start = -1;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 's') {
				if(start != -1) {
					substrings.add(s.substring(start+1, i));
				}
				start = i;
			}
		}
		
		System.out.println(substrings);
	}

}
