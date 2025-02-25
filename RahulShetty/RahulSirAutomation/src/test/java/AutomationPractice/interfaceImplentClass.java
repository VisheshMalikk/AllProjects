package AutomationPractice;

public class interfaceImplentClass implements MyInterface {
	
	public static void main(String[] args) {
		
		interfaceImplentClass cl = new interfaceImplentClass();
		cl.admissionOpen();
	}

	@Override
	public void admissionOpen() {
		System.out.println("Now : Admission is opened for B.Tech");
		
	}

	@Override
	public void admissionFees() {
		System.out.println("Admission fees for B.Tech is 25 lakh");
	}

	@Override
	public void admissionClose() {
		System.out.println("Now : Admission has been closed for B.Tech");
	}

}
