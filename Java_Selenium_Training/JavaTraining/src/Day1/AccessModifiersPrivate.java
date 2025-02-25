package Day1;

class A {
	private int data = 40;

	private void message() {
		System.out.println("Hello World .. !!");
		System.out.println("Data is : " + data);
	}
}

public class AccessModifiersPrivate {

	public static void main(String[] args) {
		A obj = new A(); // Creating Object of the A class here
		System.out.println(obj.data); // Compile Time error
		obj.message(); // Compile Time error

	}

}
