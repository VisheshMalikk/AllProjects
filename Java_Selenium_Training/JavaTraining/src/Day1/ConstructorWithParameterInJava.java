package Day1;

public class ConstructorWithParameterInJava {

	int marks; // Create a class attribute
	String companyName;

	// Create a class constructor for the Main class
	public ConstructorWithParameterInJava(int y, String z) { // you can have as many parameters as you want:
		this.marks = y; // Set the initial value for the class attribute marks and companyName
		this.companyName = z;
		
	}

	public static void main(String[] args) {
		// Create an object of class Main (This will call the constructor)
		ConstructorWithParameterInJava myObj = new ConstructorWithParameterInJava(100, "Coforge"); 
		System.out.println("Obtained Marks :" + myObj.marks); // Print the value of marks
		System.out.println("COmpany name is : " + myObj.companyName); // Print the value of the name of company
	}

}
