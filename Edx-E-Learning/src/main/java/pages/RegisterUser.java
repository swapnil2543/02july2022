package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser {
	WebDriver driver;
	
	@FindBy(xpath = "//a[@class='btn btn-brand user-link mx-1 register-link']")
	private WebElement registerForFreeButton;
	
	@FindBy(xpath = "//a[@class='btn btn-tertiary user-link sign-in-link']")
	private WebElement signInButton;
	
	
	
	public RegisterUser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRegisterFreeButton()
	{
		registerForFreeButton.click();
	}
	
	public void clickOnSignInButton()
	{
		signInButton.click();
	}

}
