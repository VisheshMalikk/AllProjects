package ArrayPrograms;

public class FindLargestNumFromArray {

	public static void main(String[] args) {

		int[] marks = { 34, 56, 78, 23, 59, 1001};
		int max = findLargestNumber(marks);
		System.out.println(max);

	}

	public static int findLargestNumber(int[] marks) {
		int max = marks[0];
		for (int i = 1; i < marks.length; i++) {
			if (marks[i] > max) {
				max = marks[i];
			}
		}

		return max;
	}

}
