package OopsRelatedProgram;

public class StaticMethodCannotOveriddenChildClass extends StaticMethodCannotOveriddenParentClass {

	public static void main(String[] args) {
		
		// We can just use the static method of parent class into child class but cannot override
		//printAddress();

	}
	
	// Cannot override static method
	void printAddress() {
		System.out.println("Pune Maharastra");
	}

}
