package Day2;

public class ArrayBasics { // This is Super or Parent class

	protected void showMyName() {
		System.out.println("Vishesh Malik");
	}

	public static void main(String[] args) {
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" }; // Initilisation of an array
		System.out.println(cars[3]); // Access the Elements of an Array
		// Change an element array
		cars[1] = "Honda";
		System.out.println(cars[0]);
		// Length of an array
		System.out.println(cars.length);

		// Loop Through an Array
		System.out.println(" -----------  Loop through an array with for loop ------------- ");
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println(" -----------  Loop through an array with for each loop ------------- ");
		for (String i : cars) {
			System.out.println(i);
		}
	}
}
