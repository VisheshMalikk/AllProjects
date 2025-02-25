package CollectionFrameworkRelatedProgram.List;

import java.util.ArrayList;
import java.util.List;

public class ListCOncepts {

	public static void main(String[] args) {
	
		// Resizable/Growable array
		// Duplicates allowed
		// Insertion order preserve
		// Heterogenous objects can insert : How is it possible ?
		// In Java, every class directly or indirectly inherits from java.lang.Object
		// This means any object of any class can be assigned to a reference of type Object
		// For example : Object obj1 = "Hello";
		// For example : Object obj2 = 123;
		// For example : Object obj3 = new Date();
		// 'NULL' insertion also possible
		List<Object> list = new ArrayList<>();
		
		list.add(100);
		list.add(null);
		list.add("Coforge");
		
		System.out.println(list);
		
		
	}

}
