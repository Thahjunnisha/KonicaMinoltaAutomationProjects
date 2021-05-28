package km.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import km.base.TestBase;
import km.pages.EbaySearchPage;
import km.pages.UserNamePage;


public class EbaySearchSteps {
	 private TestBase base=new TestBase();
	 
	 public EbaySearchPage ebaysearchpg;

	@Given("user is on {string}")
	public void user_is_on(String url) {
		
		
		base.initialization(url);
		ebaysearchpg=new EbaySearchPage();
	}
	
	@When("I search for {string}")
	public void i_search_for(String productname) {
	   ebaysearchpg.searchProduct(productname);
	}
	@When("I click on search")
	public void i_click_on_search() {
	    ebaysearchpg.searchClick();
	}
	@Then("Print the  price")
	public void print_the_price() throws InterruptedException {
	    ebaysearchpg.printFirstProduct();
	}



}
