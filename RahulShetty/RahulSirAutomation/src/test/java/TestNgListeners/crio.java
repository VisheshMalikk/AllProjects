package TestNgListeners;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utils.BaseClass;

public class crio extends BaseClass {
	
	WebDriver driver;
	
	public crio(WebDriver driver) {
		driver = this.driver;
	}
	
	@Test
	public void getTitle() {
	}

}
