package ArrayPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] result = twoSum(new int[] {4, 7, 2, 4, 5}, 7);
		System.out.println(Arrays.toString(result));
	}
	
public static int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++) {
            int cur = nums[i];
            int x = target - cur;
            if(map.containsKey(x)) {
                return new int[] {map.get(x), i};
            }
            map.put(cur, i);
        }
        return null;
    }

}
