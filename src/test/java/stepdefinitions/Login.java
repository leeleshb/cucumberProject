package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {

	@Before(order=0)
	public void setUpOne() {
		System.out.println("-- Before hook setUp one method got executed");
	}
	
	@Before(order=1)
	public void setUpTwo() {
		System.out.println("-- Before hook setUp two method got executed");
	}
	
	@Before(order=2)
	public void setUpThree() {
		System.out.println("-- Before hook setUp three method got executed");
	}
	
	@After(order=2)
	public void tearDownOne() {
		System.out.println("-- After hook tearDown one method got executed");
	}
	
	@After(order=1)
	public void tearDownTwo() {
		System.out.println("-- After hook tearDown two method got executed");
	}
	
	@After(order=0)
	public void tearDownThree() {
		System.out.println("-- After hook tearDown three method got executed");
	}
	
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
	   System.out.println(">> User got navigated to login page");
	}

	@When("^User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String email) {
	    System.out.println(">> User has entered valid email address "+email);
	}

	@When("^User enters valid password (.+)$")
	public void user_enters_valid_password(String password) {
	   System.out.println(">> User has entered valid password "+password);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    System.out.println(">> User clicks on login button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
	    System.out.println(">> User got logged in successfully");
	}

	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidEmailAddress) {
	   System.out.println(">> User has enetered invalid email address "+invalidEmailAddress);
	}

	@When("User enters invalid password {string}")
	public void user_enters_invalid_password(String invalidPassword) {
	    System.out.println(">> User has entered invalid password "+invalidPassword);
	}

	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
	   System.out.println(">> User gets a proper warning message");
	}

	@When("User do not enter any credentials")
	public void user_do_not_enter_any_credentials() {
	    System.out.println(">> User has not enetered any credentials");
	}

}
