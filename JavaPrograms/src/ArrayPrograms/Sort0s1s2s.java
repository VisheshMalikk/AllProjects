package ArrayPrograms;

import java.util.Arrays;

public class Sort0s1s2s {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 1, 2, 1, 0, 2, 1, 0 };
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
		System.out.println("Sorted array : " + Arrays.toString(arr));
	}

}
