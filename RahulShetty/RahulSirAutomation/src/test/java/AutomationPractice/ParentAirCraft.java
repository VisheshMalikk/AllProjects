package AutomationPractice;


public abstract class ParentAirCraft {
	
	// These methods cannot be as a private methods because the goal of abstract is someone has to use it 
	// These can be protected, default, public
	public void engine() { // Non - Abstract method
		System.out.println("Follow Engine Guidelines ... !!!");
	}
	
	public void safteyGuidelines() { // Common to all Aircraft companies so can inherit from here
		System.out.println("Follow saftey guidelines ... !!");
	}
	
	public abstract void bodyColor(); // This method don't have implementation (So its a abstract method)

	public void upgradeEmiratesMusicSystem() {
		System.out.println("Just simple Audio System .. !!");
	}
	
	
}
