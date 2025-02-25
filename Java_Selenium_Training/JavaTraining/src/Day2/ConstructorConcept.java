package Day2;

public class ConstructorConcept {
	
	int x;  // Create a class attribute
	String CompanyName;
	int marks = 100;
	  // Create a class constructor for the Main class
	  public ConstructorConcept(String CompanyName) {
	    x = 5;  // Set the initial value for the class attribute x
	    this.CompanyName = CompanyName;
	  }

	  public static void main(String[] args) {
		 ConstructorConcept Obj = new ConstructorConcept("Coforge"); // Create an object of class Constructor (This will call the constructor)
	     System.out.println(Obj.x); // Print the value of x
	     System.out.println(Obj.CompanyName);
	  }

}
