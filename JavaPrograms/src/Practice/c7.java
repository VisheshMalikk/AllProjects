package Practice;

public class c7 {

	public static void main(String[] args) {
		
		String s1 = new String("xyz");
		String s2 = "xyz";
		System.out.println(s1.intern() == s2);
	}

}
