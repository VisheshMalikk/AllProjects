package StringPrograms;

import java.util.HashMap;

public class Practice4 {

	public static void main(String[] args) {
		
		String str = "Ram Sita Ram Hanuman Hanuman Ram Ram Ram Laxman Ram Hanuman Sita";
		String strr = str.toLowerCase();
		String[] gods = strr.split(" ");
		
		HashMap<String, Integer> godCount = new HashMap<>(); 
		for (String god : gods) {
			if(godCount.containsKey(god)) {
				godCount.put(god, godCount.get(god) + 1);
			} else {
				godCount.put(god, 1);
			}
		}
		System.out.println(godCount);
	}

}
