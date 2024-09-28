package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	@Before("@register")						//@before ==hooks
	public void setUp() {
		System.out.println("**Browser got opened");
	}
	
	@After("@register")						//@before ==hooks and (@register or @login== tagged hooks which is applied only for tests which mentioned here)
	public void tearDown() {
		System.out.println("**Browser got closed");
	}

	@Given("User opens an application")
	public void user_opens_an_application() {
		System.out.println(">> User has open an application");
	}

	@When("user enters a valid product name in the search field")
	public void user_enters_a_valid_product_name_in_the_search_field() {
		System.out.println(">> User has enters a valid product name");
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
		System.out.println(">> User clicked on search button");
	}

	@Then("valid product should be displayed")
	public void valid_product_should_be_displayed() {
		System.out.println(">> Valid product details has displayed");
	}

	@When("user enters an invalid product name in the search field")
	public void user_enters_an_invalid_product_name_in_the_search_field() {
		System.out.println(">> User has enters an invalid product name");
	}

	@Then("User gets text message about there is no product that matches the search criteria")
	public void user_gets_text_message_about_there_is_no_product_that_matches_the_search_criteria() {
		System.out.println(">> User gets proper mesage");
	}

	@When("user do not enter any product name in the search field")
	public void user_do_not_enter_any_product_name_in_the_search_field() {
		System.out.println(">> User do not enter any product name in the search field");
	}

}
