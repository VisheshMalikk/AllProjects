package utils;

import org.openqa.selenium.WebDriver;

public class TestContextSetup {
	
	// To tell this class that what are variables and properties which you gonna share with another step definitions for reusability
	public WebDriver driver;
	public String landingPageProductName;
}
