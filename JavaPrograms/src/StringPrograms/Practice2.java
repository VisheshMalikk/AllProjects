package StringPrograms;

import java.util.Stack;

public class Practice2 {

	public static void main(String[] args) {
		
		String orgString = "Vishesh Malik";
		String revStr = "";
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < orgString.length(); i++) {
			stack.push(orgString.charAt(i));
		}
		
		while (!stack.isEmpty()) {
			revStr = revStr + stack.pop();
		}
		
		System.out.println("Reverse String is : " + revStr);

	}

}
