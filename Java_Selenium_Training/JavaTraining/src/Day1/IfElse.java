package Day1;

public class IfElse {

	public static void main(String[] args) {

		// -------------------- if ------------------------
		// boolean : true and false
		int x = 20;
		int y = 18;
		if (x < y) {
			System.out.println("x is greater than y");
		}

		// -------------- if else --------------------------
		int time = 10;
		if (time < 12) {
			System.out.println("Good Morning.");
		} else {
			System.out.println("Good evening.");
		}

		// --------------- else if Statement --------------------

		int marks = 40;
		if (marks < 10) {
			System.out.println("Poor Performance");
		} else if (marks < 35) {
			System.out.println("Good Performance");
		} else {
			System.out.println("Excellent Performance");
		}
		
		// ------------- Nested if else ---------------------------

		// Creating two variables for age and weight
		int age = 20;
		int weight = 20;
		// applying condition on age and weight
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else 
			{
				System.out.println("You are not eligible to donate blood");
			}
		}

	}

}
