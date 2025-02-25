package TakeScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // In selenium 3

		driver.manage().window().maximize();
		
		System.out.println("Title is :" + driver.getTitle());
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File src = ss.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\AutomationPractice\\RahulShetty\\MavenSeleniumConcepts\\Screenshots\\index.jpg");
		FileUtils.copyFile(src, dest);
		
	}

}
