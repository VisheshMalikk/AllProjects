package stepDefinitionFiles;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	// Run hooks before each scenario : TestNG runner will look for @Before hook
	// Might be there are so many @Before in the file so as per the tag name , the hook will run
	// Partial Code I have to move in Hook
	// Common Code I have to move Background
	@Before("@NetBankingTest")
	public void netBankingSetup() {
		System.out.println("Setup the entries in the NetBanking Database");
	}

	@Before("@MortgageTest")
	public void mortgageSetup() {
		System.out.println("Setup the entries in the Mortgage Database");
	}
	
	@After
	public void tearDown() {
		System.out.println("Cleared the entries from the Database");
	}
	
	// Sequence of execution : Before -> Background -> Scenario -> After

}
