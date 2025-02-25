package CollectionFrameworkRelatedProgram;

import java.util.ArrayList;
import java.util.List;

public class removeAllOccurancesOfItemsFromList {

	public static void main(String[] args) {
		
		List<String> carsList = new ArrayList<String>();
		
		carsList.add("BMW");
		carsList.add("KIA");
		carsList.add("HONDA");
		carsList.add("JEEP");
		carsList.add("JEEP");
		carsList.add("SUZUKI");
		carsList.add("TATA");
		carsList.add("TATA");
		
		System.out.println("Cars list : " + carsList);
		
		List<String> listOfRemoveCars = new ArrayList<String>();
		
		listOfRemoveCars.add("JEEP");
		listOfRemoveCars.add("TATA");
		
		carsList.removeAll(listOfRemoveCars);
		
		System.out.println("Cars list after remove repeated cars name : " + carsList);
		

	}

}
