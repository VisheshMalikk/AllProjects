package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateFromAnArray {

	public static void main(String[] args) {
		int a[] = { 5, 2, 6, 8, 6, 7, 5, 2, 4 };
		// Function call
		//removeDuplicatesWithHashSet(a);
		int[] arr = removeDuplicatesFromArrayWithoutSet(a);
		System.out.println("After remove the duplicates from an array : " + Arrays.toString(arr));
	}
	public static void removeDuplicatesWithHashSet(int[] a) {

		HashSet<Integer> set = new HashSet<Integer>();

		// adding elements to HashSet : It does not provide any insertion order. We can not predict the order of elements.
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		List<Integer> sortedList = new ArrayList<>(set);
		Collections.sort(sortedList);
		// Print the elements of LinkedHashSet
		System.out.print(set);
	}
	public static int[] removeDuplicatesFromArrayWithoutSet(int[] a) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int element : a) {
			if(!list.contains(element)) {
				list.add(element);
			}
		}
		int[] arr = new int[list.size()];
		int i = 0;
		for (int value : list) {
			arr[i++] = value;
		}
		return arr;
	}

}
