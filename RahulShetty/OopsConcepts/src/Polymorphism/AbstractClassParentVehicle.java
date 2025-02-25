package Polymorphism;

public abstract class AbstractClassParentVehicle {

	protected String vehicleName = "car";
	
	public void vehicleSpeed() {
		System.out.println("Vehicle average speed should be 80 km/hr");
	}
	
	public abstract void vehicleType();
	
	public void vehicleColor() {
		System.out.println("Vehicle color is white");
	}
	
	public abstract void VehicleNoOfGears();
	

}
