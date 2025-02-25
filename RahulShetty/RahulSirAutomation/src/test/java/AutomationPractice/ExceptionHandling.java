package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionHandling {

	WebDriver driver;

	@Test
	public void fnExceptionHandling() {
		System.setProperty("webdriver.chrome.driver","C:\\AutomationPractice\\RahulShetty\\JavaStreams\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.xpath("//a[text()='Imagess']")).click();
		} catch (Exception e) {
			System.out.println("Element is not present on the current webpage : " + e.getMessage());
		} 
		driver.close();
	}

}
