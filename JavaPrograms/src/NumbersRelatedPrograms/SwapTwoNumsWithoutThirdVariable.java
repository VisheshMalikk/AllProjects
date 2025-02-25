package NumbersRelatedPrograms;

public class SwapTwoNumsWithoutThirdVariable {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 7;
		
		System.out.println("Value of x before swap : " + x);
		System.out.println("Value of y before swap : " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Value of x after swap : " + x);
		System.out.println("Value of y after swap : " + y);
		
		
		

	}

}
