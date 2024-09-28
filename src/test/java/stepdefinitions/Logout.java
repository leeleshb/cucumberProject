package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {

	@When("user clicks on my account option")
	public void user_clicks_on_my_account_option() {
		System.out.println("hi");
	    System.out.println("<<user clicks on my account option>>");
	}

	@When("Select logout option")
	public void select_logout_option() {
	    System.out.println("<<Selects the logout option");
	}

	@Then("user should be taken to account logout page")
	public void user_should_be_taken_to_account_logout_page() {
	    System.out.println("<<user taken to logout page");
	}

	@Then("user clicks on continue button present there")
	public void user_clicks_on_continue_button_present_there() {
	    System.out.println("<<clicks on continue button");
	}

	@Then("user should be taken to home page")
	public void user_should_be_taken_to_home_page() {
	    System.out.println("<<user taken to home page");
	}

}
