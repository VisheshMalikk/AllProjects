package ArrayPrograms;

import java.util.HashSet;

public class FindMissingNumbersInArray {

	public static void main(String[] args) {

		int[] numbers = {2, 5, 12, 17, 19, 20};
		int max = numbers[numbers.length-1];

		findMissingNumber(numbers, max);

	}

	private static void findMissingNumber(int[] numbers, int max) {

		HashSet<Integer> set = new HashSet<>();

		for (int num : numbers) {
			set.add(num);
		}

		for (int i = 1; i <= max; i++) {
			if (!set.contains(i)) {
				System.out.println(i + " ");
			}
		}
		
	}

}
