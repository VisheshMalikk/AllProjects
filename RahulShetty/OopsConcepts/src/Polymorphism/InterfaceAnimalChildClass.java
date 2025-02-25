package Polymorphism;

public class InterfaceAnimalChildClass implements InterfaceAnimalParentClass{

	public static void main(String[] args) {
		
		InterfaceAnimalChildClass childAnimal = new InterfaceAnimalChildClass();
		
		childAnimal.sleep();
		childAnimal.sound();

	}

	@Override
	public void sound() {
		System.out.println("My sound like wee wee");
	}

	@Override
	public void sleep() {
		System.out.println("I sleep like zzzz");
	}

}
