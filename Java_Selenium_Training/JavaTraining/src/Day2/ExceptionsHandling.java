package Day2;

public class ExceptionsHandling {

	public static void main(String[] args) {
	   //withoutErrorHandling();
		 handleTheError();
		//finallyKeyword();
		//throwKeyword(15);
	}

	public static void withoutErrorHandling() {
		int[] myNumbers = { 1, 2, 3 };
		System.out.println(myNumbers[10]); // error!
	}

	// If an error occurs, we can use try...catch to catch the error and execute some code to handle it:
	public static void handleTheError() {
		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong." + e.getMessage());
		}
	}

	// Finally keyword
	public static void finallyKeyword() {
		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		} finally {
			System.out.println("The 'try catch' is finished.");
		}
	}

	public static void throwKeyword(int age) {
		    if (age < 18) {
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		    }
		    else {
		      System.out.println("Access granted - You are old enough!");
		    }
		  }

	}

 //There are many exception types available in Java: 
//ArithmeticException, 
//FileNotFoundException, 
//ArrayIndexOutOfBoundsException, 
//SecurityException, etc:


