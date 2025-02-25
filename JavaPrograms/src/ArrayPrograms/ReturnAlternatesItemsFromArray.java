package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class ReturnAlternatesItemsFromArray {

	public static void main(String[] args) {

		int[] marks = { 4, 5, 7, 8, 3, 1, 9};

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < marks.length; i+=2) {
			list.add(marks[i]);
		}
		
		System.out.println(list);
	}

}
