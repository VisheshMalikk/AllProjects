package Day2;

abstract class Bank {
	 // Abstract method (does not have a body)
	abstract int getRateOfInterest();
	// Regular method
	public void showSBIBalance() {
		System.out.println("Your SBI balance is 1000 rupees");
	}
	public void showPNBBalance() {
		System.out.println("Your PNB balance is 2000 rupees");
	}
}
//Subclass (inherit from Bank)
class SBI extends Bank {
	// The body of getRateOfInterest() is provided here
	int getRateOfInterest() {
		return 7;
	}
}

//Subclass (inherit from Bank)
class PNB extends Bank {
	// The body of getRateOfInterest() is provided here
	int getRateOfInterest() {
		return 8;
	}
}

class HDFC extends Bank {
	// The body of getRateOfInterest() is provided here
	int getRateOfInterest() {
		return 10;
	}
}

class abstractClassExample {
	public static void main(String args[]) {
		// We cannot create an object of an abstract class
		//Bank x = new Bank();
		
		SBI b = new SBI();
		System.out.println("SBI Rate of Interest is: " + b.getRateOfInterest() + " %");
		b.showSBIBalance();
		PNB c = new PNB();
		System.out.println("PNB Rate of Interest is: " + c.getRateOfInterest() + " %");
		c.showPNBBalance();
	}
}