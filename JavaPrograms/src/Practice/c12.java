package Practice;

public class c12 {

	public static void main(String[] args) {
		
		// Are static local variables allowed in Java?
		// In Java, a static variable is a class variable (for whole class). So if we have static local variable (a variable with scope limited to function), it violates the purpose of static.
		System.out.println(fun());

	}
	
	static int fun() {
		
		static int a = 10;
		return a--;
	}

}
