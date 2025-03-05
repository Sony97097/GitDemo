package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	@Given("User is  on Netbanking Landing Page")
	public void user_is_on_netbanking_landing_page() {
 System.out.println("User Landed on Netbanking Page");
	}
	@When("User  Login into Application")
	public void user_login_into_application() 
	{
		 System.out.println("User logged into Application");
	   
	}
	
	@When("User  Login into Application {string} and psssword {string}")
	public void user_login_into_application_and_psssword(String username, String password) {
		System.out.println(username+" and password is "+ password);
	    
	}
//	@When("^User  Login into Apllication (.+) and psssword (.+)$")
//	public void user_login_into_apllication_and_psssword(String username, String password) {
//		System.out.println(username+" and password is "+ password);
//	}
//	
	@When("User  Login into Application {string} and {string}")
	public void user_login_into_application_and(String string, String string2) {
	   
	}
	@Given("User is  on Practice Landing Page")
	public void user_is_on_practice_landing_page() {
		System.out.println("Practice page");
	    
	}
	@When("User  Login into Application|")
	public void user_login_into_application(List<String> data) {
		System.out.println(data.get(0));  
		System.out.println(data.get(1)); 
		System.out.println(data.get(2)); 
		
	}
	@When("Table:")
	public void table(List<String> data) {
		System.out.println(data.get(0));  
		System.out.println(data.get(1)); 
		System.out.println(data.get(2)); 
	    
	}

	@Then("Home Page is Displayed")
	public void home_page_is_displayed()
	{
		 System.out.println("Home Page is Displayed");
	   
	}
	@Then("Cards are Displayed")
	public void cards_are_displayed()
	{
		System.out.println("Cards are  Displayed");   
	}
	@Given("Setup the entries in database")
	public void setup_the_entries_in_database() {
		 System.out.println("****************");  
	}
	@When("Launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
	    
	}
	@When("Hit the home page url on banking")
	public void hit_the_home_page_url_on_banking() {
	}

	   
	}




