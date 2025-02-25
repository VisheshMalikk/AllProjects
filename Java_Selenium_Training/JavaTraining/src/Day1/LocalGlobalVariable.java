package Day1;

public class LocalGlobalVariable {
	
	int a =10;
	int b=5;
	public static void main(String[] args) {
		LocalGlobalVariable lv = new LocalGlobalVariable();
		System.out.println(lv.add()); // function Calling
		System.out.println(lv.sub()); // function Calling
	}
	
	// Local Variables
	public int add() {
		int x = 4; // Here ‘x’ is a local Variable
		return x;
	}
	// Global Variables
	public int sub(){
	return a-b; // Here a and b are global variables
	}

}
