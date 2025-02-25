package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	
	WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	private By search = By.xpath("//input[@id='search-field']");
	private By productNameUnderOfferDealPage = By.xpath("//table[@class='table table-bordered']//td[1]");
	
	public void searchItemUnderOffersPage(String productName) {
		driver.findElement(search).sendKeys(productName);
	}
	
	public String getProductNameUnderOffersPage() {
		return driver.findElement(productNameUnderOfferDealPage).getText();
	}
	
	

}
