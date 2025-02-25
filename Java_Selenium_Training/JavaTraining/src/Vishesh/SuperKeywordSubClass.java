package Vishesh;

public class SuperKeywordSubClass extends SuperKeywordSuperClass { // Subclass (child)
	// super is used to refer immediate parent class variable.
	String color = "Black";
	
	public SuperKeywordSubClass() {
		super();
		System.out.println("I am a constructor from Sub Class");
	}

	public void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	// super can be used to invoke parent class method
	public void eat() {
		System.out.println("Eating Bread");
	}

	public void play() {
		System.out.println("Playing Footabl");
	}
	
	public void action() {
		eat(); // common method name from child class
		super.eat(); // common method name from Parent class
	}
	
	
	public static void main(String args[]) {
		SuperKeywordSubClass obj = new SuperKeywordSubClass();
		//obj.printColor();
		obj.action();
	}
}
