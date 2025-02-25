package CollectionsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MutationInLists {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Kite", "Thread", "Weather", "Winter");
		List<String> movies = new ArrayList<String>(Arrays.asList("Knight Riders", "300", "Avengers", "Paradise"));

		for (String name : names) {
			System.out.println(name);
		}
		
		names.set(2, "Summer");
		
		movies.remove("300");
		movies.add("Thor");
		
		System.out.println(movies);
	
		names.remove("Winter"); 
		System.out.println(names);
	}

}
