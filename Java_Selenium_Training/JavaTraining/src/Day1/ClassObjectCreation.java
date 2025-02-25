package Day1;

public class ClassObjectCreation {

	public static void main(String[] args) {
		
		 Dog myDog = new Dog(); // Creating an object of Dog class
		 myDog.bark();
		 myDog.name = "Buddy"; // Setting the name
	     myDog.age = 3;
	     
	     System.out.println("Dog name is : " + myDog.name);
	     System.out.println("Dog age is : " + myDog.age);
	}

}

class Dog {
	String name;
	int age;

	void bark() {
		System.out.println("Woof! Woof!");
	}
}
