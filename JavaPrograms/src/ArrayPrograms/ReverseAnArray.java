package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int[] marks = {45, 56, 23, 78, 55, 90};

		List<Integer> list = new ArrayList<>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int n : marks) {
			stack.push(n);
		}
		
		System.out.println("Array before reverse : " + stack);
		
		while(!stack.isEmpty()) {
			list.add(stack.pop());
		}
		
		System.out.println("Array after reverse : " + list);
	}

}
