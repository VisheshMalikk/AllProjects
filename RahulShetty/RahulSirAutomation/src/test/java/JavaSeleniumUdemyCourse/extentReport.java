package JavaSeleniumUdemyCourse;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReport {
	ExtentReports extent;
	@BeforeTest
	public void configExtentReport() {
		// Two classes - ExtentReports, ExtentSparkReporter
		String reportPath = System.getProperty("user.dir")+"\\reports\\index.html";
		// Its a helper class to set some configs then finally it reports to main class that configs are done
		ExtentSparkReporter extentSpark = new ExtentSparkReporter(reportPath);
		extentSpark.config().setReportName("Web Automation Result");
		extentSpark.config().setDocumentTitle("Test Cases Results");
		// ExtentReports is our main class - it is responsible of our report execution
		extent = new ExtentReports();
		// The config we have set in Spark then attatch to Main class (ExtentReports)
		// Now our main class have the knowledge of extentSpark object		
		extent.attachReporter(extentSpark);
		extent.setSystemInfo("Tester", "Vishesh Malik");
	}
	
	@Test
	public void Test1() {
		// How your test case report attatch to this main class Extent 
		// create new Test Case in your reporting file
		// This class main - will monitoring the status of this test Case
		// Below method will return an object once completed the TC. We can catch that object
		ExtentTest returnedObj = extent.createTest("Verify the title of the Web Page");
		System.setProperty("webdriver.chrome.driver","C:\\AutomationPractice\\RahulShetty\\JavaStreams\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		System.out.println("Title Name is : " + driver.getTitle());
		driver.close();
		// To fail the TC explicitly 
		returnedObj.fail("Result do not match");
		// It will notify that the TC is done
		// If we have 5 TCs the add below method to the last Test Case - 5th TC
		extent.flush();
		
	}
	

}
