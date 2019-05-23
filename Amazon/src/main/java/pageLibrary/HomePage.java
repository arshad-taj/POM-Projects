package pageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(id="nav-link-yourAccount")
	public WebElement hellosSignIn;
	
	@FindBy(xpath="//a[contains(text(),'Start here.')]")
	WebElement startHere;
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void yourListMenu()
	{
		Actions a=new Actions(driver);
		a.moveToElement(hellosSignIn).perform();
	}
	
	public void clickStartHere()
	{
		startHere.click();
	}
	

}



