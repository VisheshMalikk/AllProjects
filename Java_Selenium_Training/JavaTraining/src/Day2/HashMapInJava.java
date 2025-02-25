package Day2;

import java.util.HashMap;

public class HashMapInJava {

	public static void main(String[] args) {

		// Create a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("Bharat", "New Delhi");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);

		// To access a value in the HashMap, use the get() method and refer to its key:
		//System.out.println("Capital of Bharat is : " + capitalCities.get("Bharat"));

		///To remove an item, use the remove() method and refer to the key:
		//capitalCities.remove("USA");
		//System.out.println(capitalCities);

		// To remove all items, use the clear() method:
		//capitalCities.clear();
		//System.out.println(capitalCities);

		// To find out how many items there are, use the size() method:
		//System.out.println("The Size of HashMap is :" + capitalCities.size());

		// Loop Through a HashMap
		// Print keys
		System.out.println("The keys are :");
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}

		// Print values
		System.out.println("The Values are :");
		for (String i : capitalCities.values()) {
			System.out.println(i);
		}

		// Print keys and values
		for (String i : capitalCities.keySet()) {
			System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}
	}

}
