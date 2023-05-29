package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement fullName;
	
	@FindBy(xpath ="//input[@id='email']" )
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username ;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='country']")
	private WebElement country;
	
	@FindBy(xpath = "//button[@id='register-user']")
	private WebElement createanAccountForFreeButton;
	
	@FindBy(xpath = "//img[@alt='edX']")
	private WebElement img;
//	
//	@FindBy(xpath = )
//	private WebElement ;
//	
//	@FindBy(xpath = )
//	private WebElement ;
//	
//	@FindBy(xpath = )
//	private WebElement ;
	
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void sendNameIntoNameTextBox()
	{
		fullName.sendKeys("Abc Xyz");
	}
	public void sendEmailIntoEmailTextBox()
	{
		email.sendKeys("cba121@gmail.com");
	}
	
	public void sendusernameIntoUsernameTextBox()
	{
		username.sendKeys("paulwalker_002");
	}

	public void sendPasswordIntoPasswordTextBox()
	{
		password.sendKeys("xyz@1234");
	}
	public void selectCountryFromDropDrown()
	{
		country.click();
	}
	public void clickOncreateAnAccountButton()
	{
		createanAccountForFreeButton.click();
	}
	public void clickOnHomePage()
	{
		img.click();
	}
}
