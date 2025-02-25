package CollectionFrameworkRelatedProgram.Map;

public class FindMaxOfZerosOrOnesInString {

	public static void main(String[] args) {
		
		String s = "10110001110010101111111000000000000000000000000000000";
		
		int maxCount = 0;
		int currentCount = 1;
		
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i-1)) {
				currentCount++; // Increment if the current char is same as the previous 
			} else {
				maxCount = Math.max(maxCount, currentCount); // Update Max count
				currentCount = 1; // Reset count for the new Character
			}
		}
		// Final comparison for the last sequence
		maxCount = Math.max(maxCount, currentCount);
		System.out.println(maxCount);
	}

}
