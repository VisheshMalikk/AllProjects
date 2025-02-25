package CollectionFrameworkRelatedProgram.List;

import java.util.Arrays;
import java.util.List;

public class ListOfVsAsList {

	public static void main(String[] args) {
	
		
		String[] colors = {"Red", "Yellow", "Blue", "White"};
		
		//List<String> listColors = List.of(colors);
		List<String> listColors = Arrays.asList(colors);
		
		listColors.set(1, "Black");
		//listColors.add("Orange"); 
		
		System.out.println(listColors);
	}

}
