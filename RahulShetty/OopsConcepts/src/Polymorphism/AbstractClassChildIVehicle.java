package Polymorphism;

public class AbstractClassChildIVehicle extends AbstractClassParentVehicle {

	public static void main(String[] args) {
		
		AbstractClassChildIVehicle child = new AbstractClassChildIVehicle();
		child.vehicleColor();
		child.vehicleType();
		child.VehicleNoOfGears();
	}

	@Override
	public void vehicleType() {
		System.out.println("Hey I am from child class : Vehicle type is 4 wheeler");
	}
	
	public void vehicleColor() {
		System.out.println("My vehicle color is black");
	}

	@Override
	public void VehicleNoOfGears() {
		System.out.println("My vehicle has five gears");
	}

}
