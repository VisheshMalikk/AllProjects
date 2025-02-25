package MethodChainingConcept;

public class LoginPage {
	
	public HomePage login() {
		System.out.println("Login into application ..");
		return new HomePage();
	}
	
}
