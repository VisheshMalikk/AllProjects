package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

public class OfferPageStepDefinition {

	String offerPageProductName;
	TestContextSetup testContextSetup;

	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Then("User searched for {string} shortname in offers page")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String productShortName)throws InterruptedException {
		switchToChildWindow();
		OffersPage offersPage = new OffersPage(testContextSetup.driver);
		offersPage.searchItemUnderOffersPage(productShortName);
		Thread.sleep(2000);
		offerPageProductName = offersPage.getProductNameUnderOffersPage();
	}

	public void switchToChildWindow() {
		LandingPage landingPage = new LandingPage(testContextSetup.driver);
		landingPage.clickTopDealLink();
		Set<String> s1 = testContextSetup.driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentWin = i1.next();
		String childWin = i1.next();
		testContextSetup.driver.switchTo().window(childWin);
	}

	@Then("Validate product name in offers page matches with landing page")
	public void Validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(testContextSetup.landingPageProductName, offerPageProductName);
	}

}
