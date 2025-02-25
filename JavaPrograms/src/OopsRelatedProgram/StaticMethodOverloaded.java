package OopsRelatedProgram;

public class StaticMethodOverloaded {

	// Static methods can be overloaded but not be overidden
	public static void main(String[] args) {
	
		System.out.println(printName("Vishesh", "Malik"));
		System.out.println(printName(5,3));
	}
	
	public static String printName(String name, String surname) {
		return name + " " + surname;
	}
	
	public static int printName(int a, int b) {
		return a+b;
	}

}
