package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.RegisterPage;
import pages.RegisterUser;

public class VerifyRegisterPage {
	
	WebDriver driver;
	private LoginPage lp;
	private RegisterPage rp;
	private RegisterUser re;
	
	
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\browser\\chromedriver.exe");
		this.driver = new ChromeDriver();
		System.out.println("Browser launch successfully");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	@BeforeMethod
	public void initialiseObject()
	{
		driver.get("https://www.edx.org");
		lp = new LoginPage(driver);
		rp = new RegisterPage(driver);
		re = new RegisterUser(driver);
		re.clickOnRegisterFreeButton();
	}
	
	@Test (priority = 1)
	public void fillDataOntoRegisterPage() throws InterruptedException
	{
		
		rp.sendNameIntoNameTextBox();
		rp.sendEmailIntoEmailTextBox();
		rp.sendusernameIntoUsernameTextBox();
		rp.sendPasswordIntoPasswordTextBox();
		rp.clickOncreateAnAccountButton();
		
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://authn.edx.org/register?external_link=true");//https://authn.edx.org/welcome
		
	}
	@Test (priority = 2)
	public void fillDataIntoSignInTab() throws InterruptedException
	{
		lp.clickOnSignInTab();
		lp.sendDataIntoUsernameTextBox();
		lp.sendPasswordIntoPasswordTextBox();
		lp.clickOnSignInButton();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		lp.clickOnCloseButtonOfPopup();
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Learner Home");
		
	}
	
	@AfterMethod
	public void gotoHomePage()
	{
		
		rp.clickOnHomePage();
	}
	@AfterClass
	public void closeBrowser()
	{
		lp =null;
		re=null;
		rp = null;
		driver.quit();
		driver = null;
		System.gc();
	}

}
