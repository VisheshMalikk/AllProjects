package Day1;

public class AccessModifiersPublicMain {

	public static void main(String[] args) {
		// Creating an instance of the Vehicle class
		AccessModifiersPublicVehicle car = new AccessModifiersPublicVehicle("Car");

		// Accessing the public variable
		System.out.println("Vehicle Type: " + car.type);

		// Calling the public method
		car.displayInfo();
	}

}


