package com.tests;

public class practiceofProgramms {

	public static void main(String[] args) {
		practiceofProgramms ps = new practiceofProgramms();
		String result = ps.findLongestPrefix();
		System.out.println(result);
	}

	public String findLongestPrefix() {
		String[] names = { "vishesh", "vishnu", "vinova" };
		String ref = names[0];

		for (int i = 0; i < ref.length(); i++) {
			for (int j = 1; j < names.length; j++) {
				if (names[j].charAt(i) != ref.charAt(i)) {
					return ref.substring(0, i);

				}
			}
		}
		return ref;
	}
}
