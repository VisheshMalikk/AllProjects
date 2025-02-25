package Day2;

public class FinalKeyword {

	final int x = 10;

	public static void main(String[] args) {
		FinalKeyword myObj = new FinalKeyword();
		myObj.x = 25; // will generate an error: cannot assign a value to a final variable
		System.out.println(myObj.x);
	}

}
