package Practice;

public class c13 {

	public static void main(String[] args) {


		char[] str = {'h', 'i'};
		
		String newStr = new String(str);
		
		System.out.println(newStr);
		
		// -----------------------------------------------
		
		String empty = "";
		
		for (int i = 0; i < str.length; i++) {
			empty = empty + str[i];
		}
		
		System.out.println(empty);

	}

}
