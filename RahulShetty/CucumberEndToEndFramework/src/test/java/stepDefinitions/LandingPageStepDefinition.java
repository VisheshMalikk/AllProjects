package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	
	TestContextSetup testContextSetup;
	
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Given("User is on GreenKart landing page")
	public void user_is_on_green_kart_landing_page() {
		WebDriverManager.chromedriver().setup();
		testContextSetup.driver = new ChromeDriver();
		testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		testContextSetup.driver.manage().window().maximize();
	}
	@When("User search with shortname {string} and extracted actual name of product")
	public void user_search_with_shortname_and_extracted_actual_name_of_product(String productShortName) throws InterruptedException {
		LandingPage landingPage = new LandingPage(testContextSetup.driver);
		landingPage.searchItem(productShortName);
		Thread.sleep(2000);
		testContextSetup.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
		System.out.println("Landing page product name is : " + testContextSetup.landingPageProductName);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
