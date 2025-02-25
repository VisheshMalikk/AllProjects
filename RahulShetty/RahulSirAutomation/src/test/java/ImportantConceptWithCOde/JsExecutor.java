package ImportantConceptWithCOde;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\AutomationPractice\\RahulShetty\\JavaStreams\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JsExecutor je = new JsExecutor();
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("document.getElementByID('').value = 'vishesh';");
		 * js.executeScript("document.getElementByID('').value = '1@Malik';");
		 * js.executeScript("document.getElementByID('').click();");
		 */
		
		String path = "C:\\Users\\Vishesh.1.Malik\\Downloads>";
		
		je.takeScreenSnap(driver, path);

	}
	
	public void takeScreenSnap(WebDriver driver, String path) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	}

}
