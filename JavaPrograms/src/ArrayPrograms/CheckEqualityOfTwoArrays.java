package ArrayPrograms;

import java.util.Arrays;

public class CheckEqualityOfTwoArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {5,2,6,7};
		int[] arr2 = {2,5,7,6};
		
		int[] sortedArr1 = sortArray(arr1);
		System.out.println(Arrays.toString(sortedArr1));
		int[] sortedArr2 = sortArray(arr2);
		System.out.println(Arrays.toString(sortedArr2));
		System.out.println(Arrays.equals(sortedArr1, sortedArr2));
	}
	
	
	public static int[] sortArray(int[] arr) {
		
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	

}
