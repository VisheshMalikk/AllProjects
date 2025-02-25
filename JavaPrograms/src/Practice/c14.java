package Practice;

public class c14 {

	public static void main(String[] args) {
		
		// DIFFERENT WAYS TO CREATE ARRAY IN JAVA
		
		//Array Literal in Java
		//In a situation where the size of the array and variables of the array are already known, array literals can be used. 
		// Declaring array literal
		//int[] marks = new int[] {45, 67, 32, 89, 54};
		
		
		//int[] marks = {45, 67, 32, 89, 54};
		//int []marks = {45, 67, 32, 89, 54};
		//int marks[] = {45, 67, 32, 89, 54};
		
		// Combining both statements in one : Declaring and Allocating Memory at a time
		int[] marks = new int[5];
		marks[0] = 45;
		marks[1] = 67;
		marks[2] = 32;
		marks[3] = 89;
		marks[4] = 54;
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
	}

}
