package ArrayPrograms;

public class FindMax1sInString {

	public static void main(String[] args) {
		
		String s = "100000000";
		
		int maxCount = 0;
		int currentCount = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				currentCount++;
				maxCount = Math.max(maxCount, currentCount);
			} else {
				currentCount = 0;
			}
		}
		System.out.println("Max no of 1s : " + maxCount);
	}

}
