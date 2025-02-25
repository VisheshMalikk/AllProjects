package com.tests;

import java.util.HashMap;

import org.testng.annotations.Test;

public class programms {

	@Test()
	public void findCountOfLettersInString() {
		String name = "ggfsdffddsssvgaaasgsfrwwsswwwwbbhhgjkoookkk";
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < name.length(); i++) {
			if (map.containsKey(name.charAt(i))) {
				int count = map.get(name.charAt(i));
				map.put(name.charAt(i), ++count);
			} else {
				map.put(name.charAt(i), 1);
			}

		}
		System.out.println(map);
	}

// ---------------------------------------------------------------------------
	@Test(enabled = false)
	public void reverseString() {
		String company = "Coforge";
		String revString = "";
		for (int i = 0; i < company.length(); i++) {
			revString = company.charAt(i) + revString;
		}
		System.out.println("Reversed String : " + revString);
	}

	// ------------------------------------------------------------------------
	@Test
	public void fndCountOfSpecificCharInString() {
		String name = "fhfgfgdfdgghshshshhshhggggggggggg";
		char[] arr = name.toCharArray();
		int count = 0;
		for (char a : arr) {
			if (a == 'g') {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
	public void fndCountOfSpecificCharInString2() {
		String name = "fhfgfgdfdgghshshshhshhggggggggggg";
		int counter = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'h') {
				counter++;
			}
		}
		System.out.println(counter);
	}

	// -----------------------------------------------------------------------

	@Test
	public void swapNumber() {
		int a = 10;
		int b = 20;
		int temp = a;
		a = b;
		b = temp;
		System.out.println("The value of a :" + a);
		System.out.println("The value of b :" + b);
	}

	// ------------------------------------------------------------------

	@Test
	public void wrapperClass() {
		// int a = 100 ---- Its a primitive Data Type, its work just to store and fetch
		// the value
		// If we want to : a act like a class or object then we have a concept Wrapper
		// class
		// To create a wrapper object, use the wrapper class instead of the primitive
		// type. To get the value, you can just print the object:
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myChar);

	}

	@Test
	public void findLongestPrefixOfString() {
		
		String[] names = { "vishesh", "vishnu", "vinova" };
		String ref = names[0];

		for (int i = 0; i < ref.length(); i++) {
			for (int j = 1; j < names.length; j++) {
				if (names[j].charAt(i) != ref.charAt(i)) {
					System.out.println(ref.substring(0, i));

				}
			}
		}
			System.out.println(ref);
		}
}
