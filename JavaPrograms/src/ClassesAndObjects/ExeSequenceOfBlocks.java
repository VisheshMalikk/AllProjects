package ClassesAndObjects;

public class ExeSequenceOfBlocks {

	static 
	{
		System.out.println("Static Block");
	}

	{
		System.out.println("Instance Block");
	}

	public ExeSequenceOfBlocks() {
		System.out.println("Constructor Block");
	}

	public static void main(String[] args) {
		new ExeSequenceOfBlocks();
		new ExeSequenceOfBlocks();
	}

}
