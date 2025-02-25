package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class streamsBasics {

	@Test(enabled = false)
	public void countNameStartsWithARegularWay() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Naman");
		names.add("Abhay");
		names.add("Abhi");
		names.add("Komal");
		names.add("Kane");
		names.add("Anjan");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			if (name.startsWith("A")) {
				count++;
			}
		}

		System.out.println("No of Names starts with A letter : " + count);

	}

	@Test(enabled = false)
	public void countNameStartsWithAJavaStreamsFilter() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Naman");
		names.add("Abhay");
		names.add("Abhi");
		names.add("Komal");
		names.add("Kane");
		names.add("Anjan");

		long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println("No of Names starts with A letter using Java Streams : " + c);
	}

	@Test(enabled = false)
	public void countNameStartsWithAJavaStreamsFilter1() {
		Long d = Stream.of("Nitin", "Aman", "Ajay", "Anuj", "Anurag").filter(s -> {
			s.startsWith("A");
			return false;
		}).count();
		System.out.println("No of Names starts with A letter using Java Streams : " + d);
	}

	@Test(enabled = true)
	public void printNamesWithLengthGreaterThanFourWithJavaStreamsFilter() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Abha");
		names.add("Abhi");
		names.add("Koma");
		names.add("Kane");
		names.add("Anjannnn");

		// Print all the names of Array List
		 names.stream().filter(s -> s.length()>4).forEach(s->System.out.println(s));
		//names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	@Test(enabled = false)
	public void printNamesStartsWithAJavaStreamsFilter() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Naman");
		names.add("Azhay");
		names.add("Abhi");
		names.add("Komal");
		names.add("Kane");
		names.add("Anjan");

		// Print all the names of Array List
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s -> System.out.println(s));
	}

	@Test(enabled = false)
	public void findDuplicateCharsIntoString() {

		String name = "vishesh";
		String[] stringarray = name.split("");

		Map<String, Long> map = Arrays.stream(stringarray).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		map.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}
