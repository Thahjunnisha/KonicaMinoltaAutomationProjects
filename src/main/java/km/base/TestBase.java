package km.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import km.util.TestUtil;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException r) {
		r.printStackTrace();
	}
	}



public  void initialization(String page){
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")){
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver(); 
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	if(page.equals("GmailSignupPage"))
	{
	driver.get(prop.getProperty("GmailSignupPage"));
	
	
	
	
	}
	else if (page.equals("GmailSigninPage"))
	{
		driver.get(prop.getProperty("GmailSigninPage"));
	}
	else if (page.equals("EbayHomePage"))
	{
		driver.get(prop.getProperty("EbayHomePage"));
	}
	

	
	
	
	
}


}




