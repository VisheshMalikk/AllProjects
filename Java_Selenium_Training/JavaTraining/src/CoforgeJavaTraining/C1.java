package CoforgeJavaTraining;

public class C1 {

	public static void main(String[] args) {
		
		// In java we can declare String : in 2 ways 
		// String Literals
		// With the help of New 
		
		// 1) 
		String name = "Coforge";
		
		//2 ) 
		String name1 = new String("Coforge");
		
		// If there is a class in Java : 
		System.out.println(name1.length());
		
		//C1 c = new C1();
		//c.printMyName();
		
		printMyName();
		int z = sum();
		System.out.println(z);
		
	}
	
	public static void printMyName() {
		System.out.println("My name is Coforge");
	}

	public static int sum() {
		int result = 5+10;
		return result;
	}
	
}
