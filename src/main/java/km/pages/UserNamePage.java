package km.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import km.base.TestBase;

public class UserNamePage extends TestBase {
		

			
	private By emailId = By.id("identifierId");
	private By NextBtn = By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']");
	private By Password=By.xpath("//input[@name='password']");
	private By errorMsgForBlankUserName=By.xpath("//div[contains(text(),'Enter an email or phone number')]");
	private By errorMsgForInvalidUserName=By.xpath("//div[@class='o6cuMc']");
	
	public UserNamePage(){
			PageFactory.initElements(driver, this);
			}
		
		
			
			public void EnterUserName(String userName){
				driver.findElement(emailId).sendKeys(userName);
				
				
			}
			public void ClickNextBtn(){
				driver.findElement(NextBtn).click();
			
			}
			public void EnterPassword(String password){
				
				driver.findElement(Password).sendKeys(password);
				
			}
			public void VerifyErrorMsg(){
				
				driver.findElement(errorMsgForBlankUserName).isDisplayed();
				String errormsg=driver.findElement(errorMsgForBlankUserName).getText();
				System.out.println("Error Msg On Entering Blank UserName in Gmail: "+errormsg);
				
				
			}
			public void ValidateInvalidEmailIdErrorMsg(){
				WebElement element=driver.findElement(errorMsgForInvalidUserName);
	
				element.isDisplayed();
				String ActualText=element.getText();
				String ExpectedText=prop.getProperty("ExpectedText");
				assertEquals(ExpectedText,ActualText);
	
				System.out.println("The Expected and Actual text is matched");
				System.out.println("Expected Text : "+ ExpectedText  +" Actual Text : "+ ActualText);
	
			}
	}



