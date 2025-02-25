package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int[] a1 = {3,6,8,9,2,1};
		int[] a2 = {23,56,76,33,21,28};
		int[] r = mergeArray(a1, a2);
		System.out.println(Arrays.toString(r));
	}
	
	public static int[] mergeArray(int[] a1, int[] a2) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int n : a1) {
			list.add(n);
		}

		for (int n : a2) {
			list.add(n);
		}
		
		int[] result = new int[list.size()];
		Collections.sort(list);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		
		return result;
		
	}

}
