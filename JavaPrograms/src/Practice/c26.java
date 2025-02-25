package Practice;

public class c26 {

	public static void main(String[] args) {
		
		// String : Immutable in nature
		// Case 1 : 
		String s = "Durga";
		s.concat("Software");
		System.out.println(s);
		
		// Case 2 :
		String s1 = "Durga";
		String s2 = s1.concat("Software");
		System.out.println(s2);
		
		
		// StringBuffer : Mutable in nature
		// Case 3 : 
		StringBuffer sb = new StringBuffer("Durga");
		sb.append("Software");
		System.out.println(sb);

	}

}
