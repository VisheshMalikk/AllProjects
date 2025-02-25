package CollectionFrameworkRelatedProgram.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		
		String[] names = {"James", "Tom", "Jack", "Jonty", "Ben", "Tom"};
		
		List<String> nameList =  new ArrayList<>(Arrays.asList(names));
		
		System.out.println("Size of list is : " + nameList.size());
		
		System.out.println("Index of element with the help of indexOf() method : : " + nameList.indexOf("vishesh"));
		
		System.out.println("Index of element with the help of lastIndexOf() method : : " + nameList.lastIndexOf("Tom"));
		
		nameList.set(2, "Deadpol");
		
		System.out.println("After set new element with the help of set() method : " + nameList);
		
		nameList.remove(1);
		
		System.out.println("After remove element with the help of remove() method : " + nameList);
		

	}

}
