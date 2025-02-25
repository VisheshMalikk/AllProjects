package MethodChainingConcept;

public class methodChaining {
	
	public static void main(String[] args) {
		LoginPage loginPage = new LoginPage();
		loginPage.login();
		
		HomePage homePage = new HomePage();
		homePage.sendFriendRequest();
		homePage.sendMessage();
		// Without method chaining, every method call requires the object reference explicity
		// You need to write the object reference (homepage) repeatedly for each method call
		
		System.out.println("------- Now Methods Chaining --------");
		
		new LoginPage().login().sendFriendRequest().sendMessage();
	}

}
