package km.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import km.base.*;
public class CreateAccountPage extends TestBase {


	@FindBy(id="ow293")
	WebElement createaccountbutton;
	@FindBy(xpath="(//div[@class='jO7h3c'])[1]")
	WebElement formyself;
	@FindBy(id="firstName")
	WebElement firstname;
	@FindBy(id="lastName")
	WebElement lastname;
	@FindBy(id="username")
	WebElement username;
	@FindBy(xpath="//input[@name='Passwd']")
	WebElement password;
	@FindBy(xpath="//input[@name='ConfirmPasswd']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']")
	WebElement nextbutton;
	@FindBy(id="phoneNumberId")
	WebElement phonenumberid;
	@FindBy(xpath="//span[contains(text(),'Next')]/parent::button")
	
	WebElement nextbutton2;
	@FindBy(xpath="//span[contains(text(),'Next')]/following-sibling::div")
	WebElement verifybutton;
	@FindBy(xpath="//input[@id='day']")
	WebElement birthdate;
	@FindBy(xpath="//select[@id='month']")
	WebElement monthdropdown;
	@FindBy(xpath="//input[@id='year']")
	WebElement birthyear;
	@FindBy(xpath="//select[@id='gender']")
	WebElement genderdropdown;
	
	@FindBy(xpath="//span[contains(text(),'Skip')]/parent::button")
	 WebElement skip;
	
		
	@FindBy(xpath="//span[contains(text(),'I agree')]/parent::button")
	WebElement IAgreebutton;
	
	@FindBy(xpath="//img[@Class='gb_Ca gbii']")
	WebElement Accountlogo;
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	public CreateAccountPage() { 
		
	 PageFactory.initElements(driver,this); 
	 }
	 
	public void click_createAccount() throws InterruptedException
	{		
		Actions as = new Actions(driver);
	    as.moveToElement(createaccountbutton).click().build().perform();
	    Thread.sleep(4000);
	    as.moveToElement(formyself).click().build().perform();
	    
		
	}
	
	
	
	public void Enter_firstname(String Firstname)
	{
		firstname.sendKeys(Firstname);
	}
	
	public void Enter_lastname(String Lastname)
	{
		lastname.sendKeys(Lastname);
	}
	
	public void Enter_username(String Username)
	{
		username.sendKeys(Username);
	}
	
	public void Enter_password(String Password)
	{
		password.sendKeys(Password);
	}
	
	public void Enter_confirmpassword(String confirmpasword)
	{
		confirmpassword.sendKeys(confirmpasword);
	}
	
	public void click_nextbutton()
	{
		nextbutton.click();
	}
	
	public void Enter_phonenumber(String phoneno)
	{
		phonenumberid.sendKeys(phoneno);
	}
	
	public void click_nextbutton2()
	{
		
		 wait.until(ExpectedConditions.elementToBeClickable(nextbutton2));
		 
		nextbutton2.click();
	}
	
	public void click_verify()
	{
		verifybutton.click();
	}
	
	public void Enter_Birthdate(String date)
	{
		birthdate.sendKeys(date);
	}
	
	public void Select_Birthmonth(String month)
	{
		monthdropdown.click();
		Select ss = new Select(monthdropdown);
		ss.selectByVisibleText(month);
	}
	
	public void Enter_BirthYear(String year)
	{
		birthyear.sendKeys(year);
	}
	
	public void Select_Gender(String gender)
	{
		genderdropdown.click();
		Select s2= new Select(genderdropdown);
		s2.selectByVisibleText(gender);
	}
	
	public void Click_YesIamIn() throws InterruptedException 	{	
		
		Thread.sleep(4000);		
		skip.click();
	}
	
	public void Click_Iagree()
	{
		
		  wait.until(ExpectedConditions.elementToBeClickable(IAgreebutton));		 
		  IAgreebutton.click();
	}
	public void VerifySuccessCreation()
	{
		
		  wait.until(ExpectedConditions.visibilityOf(Accountlogo));		 
		   Accountlogo.isDisplayed();
	}
	
}


