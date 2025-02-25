package ArrayPrograms;

import java.util.Arrays;

public class FindMaxDiffBetweenNumbersInArray {

	public static void main(String[] args) {
		
		int[] marks = {4, 6, 2, 7, 10};
		
		int diff = findMaxDiffBetweenTwoElementsInArray(marks);
		System.out.println("Maximum difference beween two items in an array : " + diff);

	}
	
	public static int findMaxDiffBetweenTwoElementsInArray(int[] arr) {
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int diff = arr[arr.length - 1] - arr[0];
		
		return diff;
	}

}
