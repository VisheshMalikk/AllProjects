package realTimeTestCasesWithListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AllTestCases {
	
	WebDriver driver;
	
	public AllTestCases(WebDriver PDriver){
		this.driver = PDriver;
	}
	
	@Test
	public void fnGetTitle() {
		System.out.println("Title is : " + driver.getTitle());
	}

	@Test
	public void fnClickOnTableHeader() {
		driver.findElement(By.xpath("//table//th[@aria-label='Veg/fruit name: activate to sort column ascending']"))
				.click();
	}

	@Test
	public void fnGetGreenKartText() {
		String WebName = driver.findElement(By.xpath("//span[@class='redLogo']")).getText();
		System.out.println("Website Name : " + WebName);
	}

	@Test
	public void fnClickOnNextBtn() {
		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
	}

	@Test
	public void fnEnterValueInSearchBar() throws Exception {
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Rice");
	}

	
}
