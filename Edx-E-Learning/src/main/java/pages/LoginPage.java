package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//a[@id='controlled-tab-tab-/login']")
	private WebElement signInTab;
	
	@FindBy (xpath = "//input[@id='emailOrUsername']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@id='sign-in']")
	private WebElement signInButton;
	
	@FindBy (xpath = "//button[@id='password-security-close']")
	private WebElement closeButton;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnSignInTab()
	{
		signInTab.click();
	}
	
//	public void sendDataIntoUsernameTextBox()
//	{
//		username.sendKeys("paulwalker_002");
//	}
	
//	public void sendPasswordIntoPasswordTextBox()
//	{
//		password.sendKeys("xyz@1234");
//	}
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
	
	public void clickOnCloseButtonOfPopup()
	{
		closeButton.click();
	}

}
