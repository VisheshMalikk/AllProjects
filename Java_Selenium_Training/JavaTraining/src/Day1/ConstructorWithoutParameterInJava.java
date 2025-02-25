package Day1;

public class ConstructorWithoutParameterInJava {

	int x; // Create a class attribute

	// Create a class constructor for the Main class
	public ConstructorWithoutParameterInJava() {
		x = 5; // Set the initial value for the class attribute x
	}

	public static void main(String[] args) {
		// Create an object of class Main (This will call the constructor)
		ConstructorWithoutParameterInJava myObj = new ConstructorWithoutParameterInJava(); 
		System.out.println(myObj.x); // Print the value of x
	}

}
