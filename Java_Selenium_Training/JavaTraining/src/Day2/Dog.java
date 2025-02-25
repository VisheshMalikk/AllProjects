package Day2;

class Dog implements Animal, Human {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eating();
		d.sleeping();
	}
	
	public void eating() {
	    // The body of eating() is provided here
	    System.out.println("The dog is eating biscuits");
	  }
	  public void sleeping() {
	    // The body of sleeping() is provided here
	    System.out.println("I am sleeping Zzz now");
	  }

}
