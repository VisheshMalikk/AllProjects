package LoginFunctionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavScriptExecutor {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // In selenium 3

		driver.manage().window().maximize();
		
		// Javascript Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('userName').value='VisheshMalik';");
		
		// Scroll down page till page bottom
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		
		

		

	}

}
