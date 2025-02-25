package Day1;

public class ReturnType {

	public static void main(String[] args) {
		
		ReturnType ret = new ReturnType();
		int z = ret.myMethod(5, 3);
		System.out.println(z);
	}
	
	public int myMethod(int x, int y) {
		int a = x + y; // Sum of x and y returning here
		return a; 

	}
}
