package ExceptionHandling;

public class c10 {

	public static void main(String[] args) {
		try {
			int result = 10 / 0;

		} catch (Exception e) {
			System.out.println("General Exception Caught");
		} catch (ArithmeticException ae) {
			// Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
			System.out.println("Arithmetic Exception Caught");
		}

	}

}
