package NumbersRelatedPrograms;

public class SwapTwoNumsWithThirdVariable {

	public static void main(String[] args) {
		
		int x = 20;
		int y = 30;
		int z;
		
		System.out.println("Value of x before swap : " + x);
		System.out.println("Value of y before swap : " + y);
		
		z = x;
		x = y;
		y = z;
	
		System.out.println("----------------------------------------------");
		
		System.out.println("Value of x after swap : " + x);
		System.out.println("Value of y after swap : " + y);
		
		
		

	}

}
