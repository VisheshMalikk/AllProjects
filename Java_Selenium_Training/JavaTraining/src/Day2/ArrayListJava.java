package Day2;

import java.util.ArrayList;

public class ArrayListJava {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		// add() method used to add items inside the cars ArrayList
		cars.add("Volvo");
		cars.add("Tata");
		cars.add("Ford");
		cars.add("Maruti");
		System.out.println(cars);
		//To access an element in the ArrayList, use the get() method and refer to the index number:
		//System.out.println(cars.get(0));
		
		// To modify an element, use the set() method and refer to the index number:
		//cars.set(0, "Nano");
		//System.out.println(cars);
		
		// To remove an element, use the remove() method and refer to the index number:
		//cars.remove(2);
		//System.out.println(cars);
		
		//To remove all the elements in the ArrayList, use the clear() method:
		//cars.clear();
		//System.out.println(cars);
		
		//To find out how many elements an ArrayList have, use the size method:
		//System.out.println("No of cars in the array list :" + cars.size());
		
		//Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:
		for (int i = 0; i < cars.size(); i++) {
		      System.out.println(cars.get(i));
		    }
		
		//You can also loop through an ArrayList with the for-each loop:
		for (String i : cars) {
		      System.out.println(i);
		    }
	}

}
