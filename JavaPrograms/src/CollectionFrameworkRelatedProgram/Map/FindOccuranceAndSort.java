package CollectionFrameworkRelatedProgram.Map;

import java.util.Map;
import java.util.TreeMap;

public class FindOccuranceAndSort {

	public static void main(String[] args) {

		String languages = "Java Python C++ Java C Python DotNet Java C++ Ruby C++ C Python";

		String[] langName = languages.split(" ");

		//Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new TreeMap<>();
		
		for (String language : langName) {
			if (map.containsKey(language)) {
				map.put(language, map.get(language) + 1);
			} else {
				map.put(language, 1);
			}
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}	
	}

}
