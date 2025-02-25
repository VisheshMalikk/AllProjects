package Day1;

public class Overloading {

	public static void main(String[] args) {

		ABC abc = new ABC();
		abc.x(50);
		abc.x("India");
		abc.x(10, 20);
	}
}

class ABC {

	public void x(int a) {
		System.out.println(a);
	}

	public void x(int a, int b) {
		System.out.println(a+b);
	}

	public void x(String name) {
		System.out.println(name);
	}

}
