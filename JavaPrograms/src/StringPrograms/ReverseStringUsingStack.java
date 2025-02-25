package StringPrograms;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		
		String str = "Automation";
		String revStr = "";
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		while (!stack.isEmpty()) {
			revStr = revStr + stack.pop();
		}
		System.out.println("Reversed String : " + revStr);
	}

}
