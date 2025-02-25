package CollectionFrameworkRelatedProgram.Map;

import java.util.ArrayList;
import java.util.List;

public class ShiftAllZerosInLast {

	public static void main(String[] args) {
		
		int[] arr = {4, 0, 8, 0, 3, 2, 0, 5, 1};
		
		List<Integer> list = new ArrayList<>();
		
		int zeros = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				list.add(arr[i]);
			} else {
				zeros++;
			}
		}
		
		for (int i = 0 ; i < zeros; i++) {
			list.add(0);
		}
		
		System.out.println("List after shift all zeros to right : " + list);
	}

}
