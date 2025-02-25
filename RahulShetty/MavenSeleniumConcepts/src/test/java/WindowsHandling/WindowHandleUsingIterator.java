package WindowsHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleUsingIterator {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // In selenium 4
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // In selenium 3
		
		driver.manage().window().maximize();
		
		// For Tab
		//driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		// For Separate Window
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		String mainWindowHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> it = windowHandles.iterator();
		
		while(it.hasNext()) {
			String handle = it.next();
			if(!handle.equalsIgnoreCase(mainWindowHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(3000);
				System.out.println("Text on child window : " + driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
				driver.close();
			}
		}
		
		driver.switchTo().window(mainWindowHandle);
		System.out.println("Title of Main Window :" + driver.getTitle());
		
	}

}
