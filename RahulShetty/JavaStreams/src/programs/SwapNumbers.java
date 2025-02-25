package programs;

public class SwapNumbers {
	
	
	public void swapvaluesUsingThirdVariable(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("The value of a :" + a );
		System.out.println("The value of b :" + b );
	}
	
	
	public static void main(String[] args) {
		SwapNumbers sn = new SwapNumbers();
		sn.swapvaluesUsingThirdVariable(10, 20);
	}
	
}
