package TestNgPackage;

import org.testng.annotations.Test;

public class LoginMobileApp {
	
	@Test(groups= {"Sanity"})
	public void fnVerifyMobileAppTitle() {
		System.out.println("Verified : Mobile Application Title is verified");
	}
	
	@Test(groups= {"Smoke"})
	public void fnVerifyMobileAppName() {
		System.out.println("Verified Smoke : Mobile Application Name is verified");
	}
	
	@Test(groups= {"Regression Test"})
	public void fnVerifyMobileAppLoginBtn() {
		System.out.println("Verified : Mobile Application Login Button verified");
	}

}
