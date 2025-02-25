package Practice;

import java.util.Arrays;

public class c25 {

	public static void main(String[] args) {
		
		
		String d = "As we are doing well we can now work we hard. He is doing hard but we are not";
		
		String[] str = d.split(" ");
		System.out.println(Arrays.toString(str));
		int temp = 0;
		for (int i = 0; i < str.length; i++) {
			if(str[i].equalsIgnoreCase("we")) {
				temp++;
			}
		}
		System.out.println(temp);
	}

}
