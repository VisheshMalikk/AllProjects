package ArrayPrograms;

import java.util.Arrays;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		
		
		int[] nums = {45, 0 , 23 , 67 , 0 , 90 , 0};
		int n = nums.length;
		
		int[] result = new int[n];
		
		int j = 0;
		
		for (int i = 0; i < n; i++) {
			if(nums[i] != 0) {
				result[j++] = nums[i]; 
			}
		}
		//System.out.println(j);
		while(j<n) {
			result[j++] = 0;
		}
		
		for (int i = 0; i < n; i++) {
			nums[i] = result[i];
		}
		
		System.out.println(Arrays.toString(nums));
	}

}
