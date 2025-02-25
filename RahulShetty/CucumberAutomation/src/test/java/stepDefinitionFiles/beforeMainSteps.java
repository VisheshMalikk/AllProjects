package stepDefinitionFiles;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class beforeMainSteps {

	@Given("Admin is on login page of Netbanking")
	public void admin_is_on_login_page_of_netbanking() {
		System.out.println("Admin is on login page of Netbanking .. ");
	}

	@Then("^User entered username (.+) and password (.+)$")
	public void admin_entered_username_and_password(String username, String password) {
		System.out.println("User entered the username and password .. " + username + " : " + password);
	}

	@When("Click on login button and logged into application")
	public void click_on_login_button_and_logged_into_application() {
		System.out.println("Click on login button and logged into application .. ");
	}

	@Given("User is on login page of Netbanking")
	public void user_is_on_login_page_of_netbanking() {
		System.out.println("User is on login page of Netbanking .. ");
	}

	@When("Click on check balance button")
	public void click_on_check_balance_button() {
		System.out.println("Clicked on the check balance button .. ");
	}

	@Then("Balance is displayed")
	public void balance_is_displayed() {
		System.out.println("Balance is displayed .. ");
	}

	// Sign up Page
	@Given("User is on Signup page of Netbanking")
	public void user_is_on_signup_page_of_netbanking() {
		System.out.println("User is on Sign up page .. ");
	}

	@When("User entering the value in the fields of form")
	public void user_entering_the_value_in_the_fields_of_form(List<String> data) {
		for (String d : data) {
			System.out.println(d);
		}
	}

	@And("User click on submit button")
	public void user_click_on_submit_button() {
		System.out.println("User click on Submit button .. ");

	}

	@Then("User account is created successfully")
	public void user_account_is_created_successfully() {
		System.out.println("User account created successfully .. ");
	}

	// Common steps definitions
	@Given("Setup the entries in database")
	public void setup_the_entries_in_database() {
		System.out.println("Setup the entries in database .. ");
	}

	@When("Launch the browser from config variable")
	public void launch_the_browser_from_config_variable() {
		System.out.println("Launch the browser from config variable .. ");
	}

	@And("Hit the login page url of net banking")
	public void hit_the_login_page_url_of_net_banking() {
		System.out.println("Hit the login page url of net banking .. ");
	}

}
