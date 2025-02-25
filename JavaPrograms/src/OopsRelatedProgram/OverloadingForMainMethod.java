package OopsRelatedProgram;

public class OverloadingForMainMethod {
	
	// Yes, we can overload main method : In the below example
	// We cannot override static method ie Static mean common for all objects so if you want to update static methods then update it into parent class
	// Static method can be overloaded 
	
	void main() {
		System.out.println("simple main method");
	}
	
	void main(String name) {
		System.out.println(name);
	}
	
	static void main(int x) {
		System.out.println("simple main method with parameter : " + x);
	}
	

	// First JVM always looks for standard main method
	public static void main(String[] args) {
		System.out.println("JVM looks for standard main method");
		OverloadingForMainMethod om = new OverloadingForMainMethod();
		om.main();
		main(20);
		om.main("Vishesh Malik");
	}
	
}
