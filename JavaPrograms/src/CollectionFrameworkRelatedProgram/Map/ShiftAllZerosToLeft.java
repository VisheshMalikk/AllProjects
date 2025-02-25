package CollectionFrameworkRelatedProgram.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftAllZerosToLeft {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 0, 1, 0, 6, 8, 0, 0, 3, 0 };

		List<Integer> list = new ArrayList<>();
		
		int noOfZeros = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				list.add(arr[i]);
			}else {
				noOfZeros++;
			}
		}
		
		for (int i = 0; i < noOfZeros; i++) {
			list.add(0, 0);
		}
		int[] result = new int[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
	
		System.out.println("Final array which contains zeros in the beginning : " + Arrays.toString(result));
	}

}
