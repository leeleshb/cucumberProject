package stepdefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	@BeforeStep("@search")
	public void beforeEveryStep() {
		System.out.println("++Before every step hook");
	}
	
	@AfterStep("@search")
	public void afterEveryStep() {
		System.out.println("++After every step hook");
	}

	@Given("User navigates to register account page")
	public void User_navigates_to_register_account_page() {
		System.out.println(">> User navigates to register account page");
	}
	
	@When("User enters first name {string} in first name field")
	public void User_enters_first_name_in_first_name_field(String firstNameText) {
		System.out.println(">> User enters first name "+firstNameText+" in the first name field ");
	}
	
	@And("enters last name {string} in the last name field")
	public void enters_last_name_in_the_last_name_field(String lastNameText) {
		System.out.println(">> User enters last name "+lastNameText+" in the last name field");
	}
	
	@And("enters email address {string} in the email address field")
	public void enters_email_address_in_the_email_address_field(String emailAddress){
		System.out.println(">> User enters email address "+emailAddress+" in the email address field");
	}
	
	@And("enters telephone no. {string} in the telephone field")
	public void enters_telephone_no_in_the_telephone_field(String telephoneNumber) {
		System.out.println(">> User enters telephone number "+telephoneNumber+" in the telephone number field");
	}
	
	@And("enters password {string} in the password field")
	public void enters_password_in_the_password_field(String password) {
		System.out.println(">> User enters password "+password+" in the password field");
	}
	
	@And("enters password {string} in the confirm password field")
	public void enters_password_in_the_confirm_password_field(String password) {
		System.out.println(">> User enters password "+password+" in the confirm password field");
	}
	
	@And("clicks on privacy policy checkbox")
	public void clicks_on_privacy_policy_checkbox() {
		System.out.println(">> User clicks on privacy policy checkbox");
	}
	
	@And("clicks on continue button")
	public void clicks_on_continue_button() {
		System.out.println(">> User clicks on continue button");
	}
	
	@Then("User get successfully registered")
	public void User_get_successfully_registered() {
		System.out.println(">> User gets successfully registered");
	}
	
	@And("selects yes option from newsletter radio button")
	public void selects_yes_option_from_newsletter_radio_button() {
		System.out.println(">> User has selected yes radio option from newsletter");
	}
	
	@And("User has not enters any field")
	public void User_has_not_enters_any_field() {
		System.out.println(">> User has not entered any field");
	}
	
	@Then("User gets warning messages for all mandatory fields")
	public void User_gets_warning_messages_for_all_mandatory_fields() {
		System.out.println(">> User gets warning messages for all mandatory fields");
	}
	
	@Then("User gets warning message as duplicate email address")
	public void User_gets_warning_message_as_duplicate_email_address() {
		System.out.println("User gets warning message as duplicate email address");
	}
}
