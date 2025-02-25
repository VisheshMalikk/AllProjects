package ArrayPrograms;

import java.util.Arrays;

public class FindSecondLargestInArray {

	public static int findSecondLargest(int[] arr) {
		if (arr == null || arr.length < 2) {
			return -1; // Return -1 if there is no second largest element
		}

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		for (int i = arr.length - 2; i >= 0; i--) { // [1, 1, 10, 12, 34, 35, 35, 35]
			if (arr[i] < arr[arr.length - 1]) {
				return arr[i];
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 35, 1, 10, 34, 1, 35, 35 };
		System.out.println("Second Largest: " + findSecondLargest(arr)); // Output: 34
	}

}
