package StringPrograms;

public class S1 {

	public static void main(String[] args) {
		
		String s1 = new String("Vishesh");
		s1.concat(" Malik");
		
		System.out.println("Using String class (Immutable) :" + s1);
		
		System.out.println("------------------------------------");
		
		StringBuilder sb = new StringBuilder("Vishesh");
		sb.append(" Malik");
		
		System.out.println("Using String Builder (Mutable) :" + sb);
		
		//System.getProperty("webdriver.chrome.driver", "Path of the driver");
		
		String s2 = null;
		
		System.out.println(s2.length());
		
		
	}

}
