package Day1;

public class Loops {
	public static void main(String[] args) {
		// Statement 1 sets a variable before the loop starts (int i = 0).
		// Statement 2 defines the condition for the loop to run (i must be less than 5).
		// If the condition is true, the loop will start over again, if it is false, the loop will end.
		// Statement 3 increases a value (i++) each time the code block in the loop has been executed.
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println(" ---------- for loop ---------------- ");

		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println(i);
		}

		// Nested For loop
		// Outer loop
		System.out.println(" ----------- Nested For Loop --------------- ");
		
		for (int i = 1; i <= 2; i++) {
			System.out.println("Outer: " + i + " Value"); // Executes 2 times

			// Inner loop
			for (int j = 1; j <= 3; j++) {
				System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
			}
		}

	}

}
