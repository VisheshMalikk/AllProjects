package stepDefinitionFiles;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {

	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
		System.out.println("User is on landing page");
	}

	@When("^User login into application with username (.+) and password (.+)$")
	public void user_login_into_application_with_username_and_password(String username, String password) {
		System.out.println("User login to application with username : " + username);
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page is displayed");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Cards are displayed");
	}
	
	
	// -------------------------
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
		System.out.println("User is on Practice landing page");
	}
	@When("User Signup for the application")
	public void user_signup_for_the_application(List<String> data) {
	   System.out.println(data.get(0));
	   System.out.println(data.get(1));
	   System.out.println(data.get(2));
	   System.out.println(data.get(3));
	   
	}
	
	// Methods for Background(common) steps
	@Given("setup the entries in database")
	public void setup_the_entries_in_database() {
		System.out.println("Entries are done in the database");
	}
	@When("Launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
		System.out.println("Chrome browser is launched");
	}
	@When("Hit the handing page url of net banking site")
	public void hit_the_handing_page_url_of_net_banking_site() {
		System.out.println("Net Banking URL is hit");
	}
	

}
