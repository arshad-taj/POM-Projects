package pageLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.TestBase;

public class SignUpPage extends TestBase{
	
	@FindBy(id="ap_customer_name")
	public WebElement nameField;
	
	@FindBy(id="ap_phone_number")
	public WebElement mobileField;
	
	@FindBy(id="ap_email")
	public WebElement emailField;
	
	@FindBy(className="a-button-inner")
	public WebElement ISDCodeDropDown; 
	
	@FindBy(id="ap_password")
	public WebElement passwordField;
	
	@FindBy(id="continue")
	public WebElement continueButton;
	
	public SignUpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signUp() 
	{
		nameField.sendKeys(prop.getProperty("username"));
		mobileField.sendKeys(prop.getProperty("Mobile"));
		passwordField.sendKeys(prop.getProperty("password"));
		continueButton.click();
	}
	
	

}
