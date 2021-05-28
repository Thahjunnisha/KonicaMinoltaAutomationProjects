package km.pages;


import java.util.ArrayList;
import java.util.Set;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import km.base.TestBase;

public class EbaySearchPage extends TestBase {
	@FindBy(xpath="//input[@id='gh-ac']")
	WebElement searchtext;
	@FindBy(xpath="//input[@id='gh-btn']")
	WebElement searchbutton;
	@FindBy(xpath= "((//div[@id='srp-river-results']//following-sibling::li)[15]//child::a)[2]")
	WebElement firstproduct;
	@FindBy(xpath="//h1[@id='itemTitle']")
	WebElement productTitle;
	@FindBy(xpath="//span[@id='prcIsum']")
	WebElement price;
	@FindBy(xpath="//div[@class='srp-river-results clearfix']/ul/li[1]/div/div[2]/a")
	WebElement Firstproduct;
	
	/*
	 * @FindAll({@FindBy(xpath = "//h3[@class='s-item__title']")}) public
	 * ArrayList<WebElement> products;
	 */
   
    public WebDriverWait wait;
    public EbaySearchPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void searchProduct(String product)
	{
		
		searchtext.sendKeys(product);
		
	}
	
	public void searchClick()
	{
		
		searchbutton.click();
	}
	public void printFirstProduct() throws InterruptedException
	{
		
		String currentHandle= driver.getWindowHandle();
	
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Firstproduct));
		/*
		 * wait.until(ExpectedConditions.visibilityOfAllElements(products));
		 * products.get(0).click();
		 */
		
		
		Firstproduct.click();	
		 Set<String> handles=driver.getWindowHandles();
		for(String actual: handles) {
		if(!actual.equalsIgnoreCase(currentHandle)) {
		
		driver.switchTo().window(actual);
		}
		
		wait.until(ExpectedConditions.visibilityOf(productTitle));
		String itemname=productTitle.getText();
		String amount = price.getText();
		System.out.println("Product Title : "+itemname);
		System.out.println("Price : "+amount);
	
	}
	}

}
