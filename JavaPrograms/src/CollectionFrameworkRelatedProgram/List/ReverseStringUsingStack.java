package CollectionFrameworkRelatedProgram.List;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		
		String s = "my laptop";
		String rev = "";
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
		}
		
		System.out.println(stack);
		
		while(!stack.isEmpty()) {
			rev = rev + stack.pop();
		}
		
		System.out.println("Reverse String is : " + rev);
	}

}
