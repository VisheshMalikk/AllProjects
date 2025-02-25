package ArrayPrograms;

public class FinMissingNumber {

	public static void main(String[] args) {
		
		
		int[] numbers = {1,2,3,5};
		
		System.out.println("Initial length of array : " + numbers.length);
		
		int n = numbers.length + 1;
		
		System.out.println("Expected length of array : " + n);
		
		int sum = 0;
		
		for (int i = 0; i < n-1; i++) {
			sum = sum + numbers[i];
		}
		
		int expectedSum = (n * (n+1))/2;
		
		int missingNum = expectedSum - sum;
		
		System.out.println(missingNum);

	}

}
