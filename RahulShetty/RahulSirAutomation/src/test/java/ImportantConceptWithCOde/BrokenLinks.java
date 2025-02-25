package ImportantConceptWithCOde;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\AutomationPractice\\RahulShetty\\JavaStreams\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*
		 * Options opt = driver.manage(); 
		 * Timeouts tm = opt.timeouts(); 
		 * Timeouts tms = tm.implicitlyWait(10, TimeUnit.SECONDS);
		 */
		
		BrokenLinks bl = new BrokenLinks();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total liks on the Webpage : " + links.size());

		for (WebElement link : links) {
			String url = link.getAttribute("href");
			bl.verifyLink(url);
		}
		
		driver.quit();

	}
	
	
	public void verifyLink(String url) 
	{
		try {
			URL link = new URL(url);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) link.openConnection();
			httpUrlConnection.connect();
			
			if(httpUrlConnection.getResponseCode() == 200)
			{
				System.out.println(url + ":" + httpUrlConnection.getResponseMessage());
			} else {
				System.out.println(url + ":" + httpUrlConnection.getResponseMessage() + ":" + " is a broken link");
			}
			
		} catch (Exception e) {
			System.out.println(url + ":" + " is a broken link");	
		}
		
	}

}













