package Practice;

import java.util.ArrayList;
import java.util.List;

public class c19 {

	public static void main(String[] args) {
		
		// Find Duplicates in an Array
		
		int[] birthDate = {25, 12, 20, 11, 20, 25, 11};
		
		List<Integer> list = finDuplicateElementsFromArray(birthDate);
		System.out.println("Duplicate Array list : " + list);

	}
	
	public static List<Integer> finDuplicateElementsFromArray(int[] birthdate) {
		
		List<Integer> duplicateList = new ArrayList<Integer>();
		
		for (int i = 0; i < birthdate.length; i++) {
			for (int j = i+1; j < birthdate.length; j++) {
				if(birthdate[i] == birthdate[j]) {
					duplicateList.add(birthdate[i]);
				}
			}
		}
		return duplicateList;
	}

}
