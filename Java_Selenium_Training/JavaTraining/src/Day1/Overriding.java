package Day1;

public class Overriding {
	
	public static void main(String[] args) {

		P p = new P();
		p.printName();
		
		P p1 = new C();
		p1.printName();
	}
}
// Parent class
class P {

	public void printCountryName() {
		System.out.println("India");
	}
	public void printName() {
		System.out.println("NIIT Technologies");
	}
}
// Child class
class C extends P {
	public void printName() {
		System.out.println("Coforge");
	}
}
