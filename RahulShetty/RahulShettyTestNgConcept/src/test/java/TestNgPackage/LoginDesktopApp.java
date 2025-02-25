package TestNgPackage;

import org.testng.annotations.Test;

public class LoginDesktopApp {
	
	@Test(groups= {"Sanity"})
	public void fnVerifyDesktopAppTitle() {
		System.out.println("Verified : Desktop Application Title is verified");
	}
	
	@Test(groups= {"Smoke"}, enabled = true)
	public void fnVerifyWebAppName() {
		System.out.println("Verified Smoke : Desktop Application Name is verified");
	}
	
	@Test(groups= {"Regression Test"})
	public void fnVerifyWebAppLoginBtn() {
		System.out.println("Verified : Desktop Application Login Button verified");
	}
}
