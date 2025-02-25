package Day1;

public class FunctionsParameters {

	public static void main(String[] args) {
		
		FunctionsParameters xyz = new FunctionsParameters();
		
		xyz.multipleParameter("visheh", 5);
		
		boolean result = myMethod(); // Calling the function here
		System.out.println(xyz.a);
		xyz.printName("Coforge"); // Passing as an argument
		
		xyz.multipleParameter("Coforge", 3);
	}

	
	int a = 100;
	
	// The function is defined here
	public static boolean myMethod() {
		System.out.println("I just got executed!");
		return true;
	}

	// Pass parameters in a function
	public void printName(String name) { // Passing as parameter
		System.out.println("My company name is :" + name);
	}

	// Pass multiple parameters in a function
	public void multipleParameter(String name, int age) { // Passing as parameter
		System.out.println("My name is " + name + " and I am " + age + " years old now ... !!");
	}

}
