package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayUsingInbuiltMethod {

	public static void main(String[] args) {

		int[] marks = { 45, 33, 22, 89, 67, 44 };
		
		List<Integer> l1 = new ArrayList<>();
		
		for (int mark : marks) {
			l1.add(mark);
		}
		
		Collections.sort(l1);
		
		System.out.println("List is : " + l1);
		
		int[] result = new int[l1.size()];
		
		for (int i = 0; i < l1.size(); i++) {
			result[i] = l1.get(i);
		}
		
		System.out.println("Array is : " + Arrays.toString(result));

	}

}
