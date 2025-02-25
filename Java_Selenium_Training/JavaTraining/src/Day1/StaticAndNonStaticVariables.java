package Day1;

public class StaticAndNonStaticVariables {

	static int a = 100; // static variable
	int b = 200; // Non Static variable
	
	public static void main(String[] args) {
		// Creating the object of the class
		StaticAndNonStaticVariables obj = new StaticAndNonStaticVariables();
		System.out.println("Sum is : " + sum(a,b));
	}
	
	public static int sum (int firstNum, int secondNum) {
		return firstNum + secondNum;
	}

}
