package TestNgPackage;
import org.testng.annotations.Test;
public class LoginWebApp {
	
	// If you want to compile and run your test case in Java then we need below function
	public static void main(String[] args) {
		
	}
	
	// Here now TestNg works as like a Compiler for us now we do not need to depend on Java Compiler
	@Test(groups= {"Sanity"})
	public void fnVerifyWebAppTitle() {
		System.out.println("Verified : Web Application Title is verified");
	}
	
	@Test(groups= {"Smoke"})
	public void fnVerifyWebAppName() {
		System.out.println("Verified Smoke : Web Application Name is verified");
	}
	
	@Test(groups ={"Regression Test"})
	public void fnVerifyWebAppLoginBtn() {
		System.out.println("Verified : Web Application Login Button verified");
	}
}
