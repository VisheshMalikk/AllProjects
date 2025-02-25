package Practice;

public class c16 {

	public static void main(String[] args) {

		int[] a = { 45, 12, 15, 2, 18 };
		System.out.println(findMin(a));
	}

	public static int findMin(int[] arr) {
		if (arr.length == 0) 
			System.out.println("Array is empty");

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		return min;

	}

}
