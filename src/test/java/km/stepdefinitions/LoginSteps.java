package km.stepdefinitions;



import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import km.base.*;
import km.pages.*;


public class LoginSteps  {
	 private TestBase base=new TestBase();
	 //private UserNamePage usernamepg=new UserNamePage(TestBase.getDriver());
	 public UserNamePage usernamepg;
		
		  @Given("User enters {string}") 
		  public void User_enters(String url) {
		 
		 base.initialization(url);
		 usernamepg=new UserNamePage(); }
		 

	@When("User enters EmailId as {string} to LogIn")
	public void user_enters_email_id_as_to_log_in(String username) {
		
		usernamepg.EnterUserName(username);
	}
	@When("Click on Next button")
	public void click_on_next_button() {
	   usernamepg.ClickNextBtn();
	}
	@Then("verify the login is successful")
	public void verify_the_login_is_successful() {
	   
	}
	@When("User enters Password to {string} to LogIn")
	public void user_enters_password_to_to_log_in(String password) {
		usernamepg.EnterPassword(password);
	}
	   
	

	@Then("Verify the Blank EmailId Error Message")
	public void verify_the_error_message() {
		usernamepg.VerifyErrorMsg();
	    
	}

	
	
	

	@Then("User validate the Invalid EmailId error message")
	public void user_validate_the_invalid_email_id_error_message() {
	   
		usernamepg.ValidateInvalidEmailIdErrorMsg();
	}



}


