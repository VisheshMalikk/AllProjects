package StringPrograms;

import java.util.Stack;

public class Practice3 {

	public static void main(String[] args) {
		
		String dome = "ollo";
		String str = "";
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < dome.length(); i++) {
			stack.push(dome.charAt(i));
		}
		while (!stack.isEmpty()) {
			str = str + stack.pop();
		}
		if(dome.equals(str)) {
			System.out.println("Given string is a Palindrome : " + dome);
		} else {
			System.out.println("Given string is not a Palindrome : " + dome);
		}
	}

}
