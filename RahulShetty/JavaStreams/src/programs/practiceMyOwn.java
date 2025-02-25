package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class practiceMyOwn {
	
	
	@Test
	public void filterStream() {
		
		List<String> countries = new ArrayList<String>();
		
		countries.add("India");
		countries.add("UK");
		countries.add("United States of America");
		countries.add("Australia");
		countries.add("Germany");
		
		// 1. Print all countries name
		//countries.stream().forEach(s->System.out.println(s));
		
		// 2. Now print total no of countries name
		//Long count = countries.stream().count();
		//System.out.println("No of countries : " + count);
		
		// 3. Convert all countries name to upper case
		//countries.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		// 4. Sort all countries name
		//countries.stream().sorted().forEach(s->System.out.println(s));
			
		// 5. Find countries name starts with char "U"
		//countries.stream().filter(s->s.startsWith("U")).forEach(s->System.out.println(s));
		
		// 6. If we have duplicates entries in the list then find only unique values
		//Stream.of("James", "Mark", "John", "Joy", "Ayana", "John", "Mark").distinct().forEach(s->System.out.println(s));
		
		// 7. Find unique values and print first one form the new list
		//Stream.of("Mark", "John", "Ayana", "Joy", "Ayana", "John", "Mark").distinct().sorted().limit(1).forEach(s->System.out.println(s));
	
		// Collect Method
		List<Integer> marks = Arrays.asList(4, 5, 6, 23, 78, 45, 4, 66, 23, 11, 78, 7);
		List<Integer> sortedMarks = marks.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(sortedMarks.get(4));
		
	
	
	}

}
