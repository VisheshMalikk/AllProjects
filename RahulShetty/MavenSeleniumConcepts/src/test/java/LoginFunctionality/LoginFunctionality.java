package LoginFunctionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunctionality {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/login");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // In selenium 3
		
		driver.manage().window().maximize();
		
		String ExpectedErrorMessage = "Your username is invalid!";
		System.out.println("Title is :" + driver.getTitle());
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		
		username.sendKeys("Vishesh");
		password.sendKeys("12345");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		String actualErrorMessage = driver.findElement(By.xpath("//div[@id='flash-message']//b")).getText();
		System.out.println("Error Message is :" + actualErrorMessage);
		Assert.assertEquals(actualErrorMessage, ExpectedErrorMessage, "Error Message is not verified");
		System.out.println("Error Message : " + actualErrorMessage + " is verified");
		
	}

}
