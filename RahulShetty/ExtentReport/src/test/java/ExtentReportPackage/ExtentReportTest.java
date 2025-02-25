package ExtentReportPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportTest {
	
	public WebDriver driver;
	ExtentReports extent;
	
	@Test
	public void extentReport() {
		ExtentTest test = extent.createTest("Extent Report configuration Test");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		//test.fail("Result do not match");
		extent.flush();
	}
	
	
	
	@BeforeTest
	public void config() {
		// ExtentReports and ExtentSparkReporter :  It is a helper class for extent which is responsible to create a HTML file and also resp for all config related to Report
		// ExtentReports = It is the main class which is resp for drive/create and consolidate all your reporting execution now attach reporter to extent
		String path=System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Vishesh Malik");
		
		
	}

}
