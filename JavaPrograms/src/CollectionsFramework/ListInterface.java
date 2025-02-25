package CollectionsFramework;
import java.util.*;
public class ListInterface {

	public static void main(String[] args) {
		
		// 1 ) List interface implements by ArrayList, LinkedList, 2) List maintains the insertion order
		// 3)  Insertion of duplicates values are allowed, 4) Heterogenous objects can insert, 5) "NULL" insertion is possible
		
		// ArrayList is use to frequent read/access operation
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8)); 
		arrayList.add(10); // Adds at the end
		System.out.println("ArrayList : " + arrayList);
		
		// subList() method to retrieve sublist from an arraylist
		List<Integer> subList = arrayList.subList(2, 6);
		System.out.println("SubList from a list : " + subList);
		
		// Heterogenous objects can insert
		List<Object> arrayList1 = new ArrayList<Object>(); 
		arrayList1.add(4);
		arrayList1.add("Vishesh");
		arrayList1.add('G');
		arrayList1.add(5.4);
		System.out.println("ArrayList of Object type: " + arrayList1);
		
		// LinkedList use to frequent insertion/deletion in the middle of the list
		List<Integer> linkedList = new LinkedList<>(arrayList); 
		linkedList.add(0, 0);
		System.out.println("LinkedList : " + linkedList);
		
		// Iterating a list to see insertion order
		String[] godsName = {"Ram", "Sita", "Laxman", "Ram", "Hanuman", "Ram"};
		List<String> godsList = new ArrayList<>();
		for (String god : godsName) {
			godsList.add(god);
		}
		System.out.println("Gods list : " + godsList);
	}

}
