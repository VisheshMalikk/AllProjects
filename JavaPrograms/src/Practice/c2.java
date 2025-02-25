package Practice;

public class c2 {

	public static void main(String[] args) {
		
		// Type casting is when you assign a value of one primitive data type to another type.
		// Widening Casting (automatically) : Converting a lower data type into a higher one is called widening type casting. It is also known as implicit conversion or casting down.
		// Narrowing Casting (manually) : Converting a higher data type into a lower one is called narrowing type casting. It is also known as explicit conversion or casting up.
		int abst = (int)(Math.abs(-2.7));
		System.out.println("Absolute number in int is : " + abst);
		System.out.println(Math.sqrt(64));
		System.out.println(Math.random());
		
		int num = (int)(Math.random() * 201 );
		System.out.println("Random Number between 0 to 100 : " + num);
	}

}
