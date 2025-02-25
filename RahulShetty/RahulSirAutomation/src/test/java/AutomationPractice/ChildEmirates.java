package AutomationPractice;

public class ChildEmirates extends ParentAirCraft {

	public static void main(String[] args) {

		// ParentAirCraft parent = new ParentAirCraft(); // Cannot instantiate the type or we cannot the create an obj of an abstract class 
		// ParentAirCraft because its an abstract class
		ChildEmirates emirates = new ChildEmirates();
		emirates.engine();
		emirates.safteyGuidelines();
		emirates.bodyColor();
		// Method Overloading 
		emirates.getData(100);
		emirates.getData("Vishesh Malik");
		emirates.getData(1000, 2000);
		// Method Overriding
		emirates.upgradeEmiratesMusicSystem();
	}
	
	

	
	public void bodyColor() {
		System.out.println("Red Color for the Aircraft Body");
	}

	public void getData(int a) {
		System.out.println(a);
	}

	public void getData(String name) {
		System.out.println(name);
	}

	public void getData(int a, int b) {
		System.out.println(a + " and " + b);
	}
	
	// upgradeEmiratesMusicSystem method(in child class) overriden/replaced the upgradeEmiratesMusicSystem that is in Parent class
	public void upgradeEmiratesMusicSystem() {
		System.out.println("This audio system is best in the world because its upgraded !! ");
	}

}
