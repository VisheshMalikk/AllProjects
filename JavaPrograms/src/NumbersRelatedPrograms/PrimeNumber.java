package NumbersRelatedPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		boolean flag = isPrimeNumber(7);
		System.out.println(flag);

	}
	
	public static boolean isPrimeNumber(int x) {
		
		if(x <= 1) { 
			return false; // numbers less than or equal to 1 are not prime
		}
		
		if(x == 2) {
			return true;
		}
		
		// Check for factors from 2 to the square root of num
		for (int i = 2; i <= x/2; i++) {
			if(x%i == 0) {
				return false; // num is divisible by i, so it's not prime
			}
		}
		
		return true; // num has no divisors other than 1 and itself, so it's prime
		
	}

}
