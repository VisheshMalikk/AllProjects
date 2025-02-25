package Day1;

public class AccessModifiersPublicVehicle {
	// Public variable
	public String type;

	// Constructor
	public AccessModifiersPublicVehicle(String type) {
		this.type = type;
	}

	// Public method
	public void displayInfo() {
		System.out.println("Vehicle Type: " + type);
	}
}
