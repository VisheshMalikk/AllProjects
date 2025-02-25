package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Java oops : Encapsulation concept to make below locators as private
	private By search = By.xpath("//input[@type='search']");
	private By productName = By.xpath("//h4[@class='product-name']");
	private By topDealLink = By.linkText("Top Deals");
	
	
	
	public void clickTopDealLink() {
		driver.findElement(topDealLink).click();
	}
	
	public void searchItem(String productName) {
		driver.findElement(search).sendKeys(productName);
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	

}
