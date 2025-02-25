package Day1;

public class Operators {

	public static void main(String[] args) {
		
		int a = 25;
		int b = 10;
		
		int sum = a + b;
		int subtract = a -b;
		int divide = a/b;
		int multiplication = a*b; 
		int mod = a%b;
		System.out.println(" -------------- Basic Arithmetic Operation -------------- ");
		System.out.println("Sum is : " + sum);
		System.out.println("Subtraction is : " + subtract);
		System.out.println("Division is : " + divide);
		System.out.println("Multiplication is : " + multiplication);
		System.out.println("Modulus is : " + mod);
		// Increment the value of a
		++a; // a = a+1
		System.out.println("Incremented value of a is : " + a);
		// Decrement the value of b
		--b; // b = b-1
		System.out.println("Decremented value of b is : " + b);

		System.out.println(" -------------- Comparison Operation -------------- ");
		int x = 5;
		int y = 3;
		System.out.println(x > y); //true
		System.out.println(x < y); // false
		System.out.println(x == y); // false
		System.out.println(x != y); // true
		System.out.println(x >= y); //  true    
		System.out.println(x <= y); // false 
		
		System.out.println(" -------------- Logical Operation -------------- ");
		int num = 5;		
	    System.out.println(num > 3 && num < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
	    System.out.println(num > 3 || num < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
	    System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
	}

}
