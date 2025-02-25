package CollectionFrameworkRelatedProgram.Map;

import java.util.Stack;

public class ReverseSentencePreservespace {

	public static void main(String[] args) {
		
		String s = "Vishesh Malik Tester";
		String r = "";
		
		char[] arr = s.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<arr.length; i++) {
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()) {
			r = r + stack.pop();
		}
		
		System.out.println(r);

	}

}
