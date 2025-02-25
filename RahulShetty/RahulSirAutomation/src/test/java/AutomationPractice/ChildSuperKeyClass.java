package AutomationPractice;

public class ChildSuperKeyClass extends ParentSuperKeyClass {
	
	
	String name = "World Cup 2023 won by India";
	
	// super keyword usage for a variable
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}

	// super keyword usage for a method
	public void company() {
		super.company();
		System.out.println("I am in HCL");
	}
	
	// super keyword usage in constructor 
	public ChildSuperKeyClass() {
		super("Ram Mandir"); // This should be always at first line
		System.out.println("Child class constructor !!");
	}
	
	public static void main(String[] args) {
		
		ChildSuperKeyClass csk = new ChildSuperKeyClass();
		csk.getName();
		csk.company();

	}

}
