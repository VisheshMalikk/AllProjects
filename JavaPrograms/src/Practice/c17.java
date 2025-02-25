package Practice;

import java.util.Arrays;

public class c17 {

	public static void main(String[] args) {

		// Find the Largest and Second Largest Element in an Array
		int[] marks = { 56, 34, 67, 45, 11, 90, 78 };
		largestAndSecondLargestElementFromArray(marks);
		System.out.println(Arrays.toString(marks));
		System.out.println("Largest number is : " + marks[marks.length-1]);
		System.out.println("Second largest number is : " + marks[marks.length-2]);
	}

	public static void largestAndSecondLargestElementFromArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

}
