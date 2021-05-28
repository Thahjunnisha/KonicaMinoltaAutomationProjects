package km.stepdefinitions;




import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import km.base.*;
import km.pages.*;

public class CreateAccountSteps {
	
	 private TestBase base=new TestBase();
		 public CreateAccountPage createAccPage;
		 
	@Given("User is on {string}")
	public void user_is_on(String url) {
		
		
		base.initialization(url);
		createAccPage=new CreateAccountPage();
	   
	}
	@When("User enter FirstName as {string}")
	public void user_enter_first_name_as(String firstname) {
		
		createAccPage.Enter_firstname(firstname);
		
		
	}
	@When("User enter LastName as {string}")
	public void user_enter_last_name_as(String lastname) {
		createAccPage.Enter_lastname(lastname);
	}
	@When("User enter UserName as {string}")
	public void user_enter_user_name_as_(String username) {
		createAccPage.Enter_username(username);
	}
	@When("User enter Password as {string}")
	public void user_enter_password_as(String password) {
		createAccPage.Enter_password(password);
	}
	 
	@When("User enter ConfirmPassword as {string}")
	public void user_enter_confirm_password_as(String confirmpassword) {
		createAccPage.Enter_confirmpassword(confirmpassword);
	}
	@When("User enter Verificationcode")
	public void user_enter_Verificationcode() throws InterruptedException {
		Thread.sleep(8000);
	}
	@When("click NextButton")
	public void click_next_button() {
		createAccPage.click_nextbutton();
	}
	@When("click NextButton2")
	public void click_next_button2() {
		createAccPage.click_nextbutton2();
	}
	@When("User enter PhoneNumber as {string}")
	public void user_enter_phone_number_as(String phonenumber) {
		createAccPage.Enter_phonenumber(phonenumber);
	}
	@When("User enter BirthDate as {string}")
	public void user_enter_birth_date_as(String birthdate) {
		createAccPage.Enter_Birthdate(birthdate);
	}
	@When("User enter BirthMonth as {string}")
	public void user_enter_birth_month_as(String birthmonth) {
		createAccPage.Select_Birthmonth(birthmonth);
	}
	@When("User enter BirthYear as {string}")
	public void user_enter_birth_year_as(String birthyear) {
		createAccPage.Enter_BirthYear(birthyear);
	}
	@When("User enter Gender as {string}")
	public void user_enter_gender_as(String Gender) {
		createAccPage.Select_Gender(Gender);
	}
	@Then("click YesIAmIn")
	public void click_yes_i_am_in() throws InterruptedException {
		createAccPage.Click_YesIamIn();
	}
	@Then("click IAgree")
	public void click_i_agree() {
		createAccPage.Click_Iagree();
		
	}
	@Then("User verify successful account creation")
	public void user_verify_successful_account_creation() {
		createAccPage.VerifySuccessCreation();
		
	}






}
