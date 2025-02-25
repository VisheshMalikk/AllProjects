package AutomationPractice;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class useCasesOfJavaStream {
	@Test
	public void webTableAutomation() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\AutomationPractice\\RahulShetty\\JavaStreams\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//th[contains(@aria-label, 'Veg/fruit name')]")).click();
		List<WebElement> originalWebElementList = driver.findElements(By.xpath("//table//tr//td[1]"));
		List<String> origList = originalWebElementList.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedList = origList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(origList.equals(sortedList));
		System.out.println("Both Lists are matching");
	
		List<String> price;
		do {
			List<WebElement> NextPageWebElementList = driver.findElements(By.xpath("//table//tr//td[1]"));
			price = NextPageWebElementList.stream().filter(s -> s.getText().equals("Pineapple"))
					.map(s -> getVeggiePrice(s)).collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		} while (price.size() < 1);
		driver.close();
	}
	public static String getVeggiePrice(WebElement e) {
		String priceValue = e.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
