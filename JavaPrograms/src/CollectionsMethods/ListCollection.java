package CollectionsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {

		List<String> countries1 = new ArrayList<String>();
		// Inserts the element to the arraylist
		countries1.add("Bharat");
		countries1.add("Isreal");
		countries1.add("Russia");
		System.out.println("Countries Name : " + countries1);

		List<String> countries2 = new ArrayList<String>();
		// Adds all elements of a collection to arraylist
		countries2.addAll(countries1);
		System.out.println("Countries2 name after addAll method : " + countries2);

		// ----------------------------------------------------------------------------------------
		// The Iterator interface is implemented by all the collection classes in Java
		Iterator<String> it = countries1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// ----------------------------------------------------------------------------------------
		// Removes all the elements from arraylist
		countries1.clear();
		System.out.println("Countries1 name after clear method : " + countries1);
		// ----------------------------------------------------------------------------------------
		// retainAll : all those elements that are not present in the specified collection are removed from the arraylist.
		// arraylist.retainAll(Collection c);
		ArrayList<String> names1 = new ArrayList<String>(Arrays.asList("James", "Tom", "Philip", "Pat", "Joy"));
		ArrayList<String> names2 = new ArrayList<String>(Arrays.asList("Ammy", "Tomika", "Joy", "James"));
		Boolean bol = names1.retainAll(names2);
		System.out.println(bol);
		System.out.println("Names1 after retain all : " + names1);
		System.out.println("Names2 after retain all : " + names2);
		// ----------------------------------------------------------------------------------------
		
		// toArray() method
		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(34, 56, 67, 63, 87));
		ArrayList<String> states = new ArrayList<String>(Arrays.asList("UP", "MP", "HP", "UK", "HR"));
		String[] arr = new String[states.size()];
		
		//Object[] arr = marks.toArray(); // returns an array of Object type if the parameter is not passed
		states.toArray(arr);
//		System.out.println("Elements of the array : ");
		System.out.println("State names are : ");
//		for (Object n : arr) {
//			System.out.println(n);
//		}
		for (String state : arr) {
			System.out.println(state);
		}
	}

}
