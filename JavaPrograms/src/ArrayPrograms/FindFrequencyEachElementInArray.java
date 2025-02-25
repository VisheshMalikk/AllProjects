package ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyEachElementInArray {

	public static void main(String[] args) {
		
		String[] names = {"Vishnu", "Shiv", "Hanuman", "Ram", "Shiv", "Ganesha", "Ram", "Shiv"};

		HashMap<String, Integer> nameAndItsFrequency = fnFindFrequencyOfElementArray(names);
		
		for(Map.Entry<String, Integer> entry : nameAndItsFrequency.entrySet()) {
		    System.out.print(entry.getKey() + " : " + entry.getValue());
		    System.out.println();
		}
	}

	private static HashMap<String, Integer> fnFindFrequencyOfElementArray(String[] names) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < names.length; i++) {
			if(map.containsKey(names[i])) {
				map.put(names[i], map.get(names[i])+1);
			} else {
				map.put(names[i], 1);
			}
		}
		return map;
	}

}
