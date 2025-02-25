package Practice;

public class c18 {

	public static void main(String[] args) {

		int[] arr = { 1,2,4};
		int n = 4;
		System.out.println("Missing Number: " + findMissing(arr, n));

	}

	public static int findMissing(int[] arr, int n) {
		int sum = (n * (n + 1)) / 2;
		for (int num : arr) {
			sum = sum - num;
		}
		return sum;
	}

}
