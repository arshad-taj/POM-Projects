import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.TestBase;
import pageLibrary.HomePage;
import pageLibrary.SignUpPage;

public class SignUpTest extends TestBase {
	
	HomePage homePage;
	SignUpPage singUpPage;
	
	@BeforeClass
	public void setUp()
	{
		initilization();
		homePage=new HomePage();
		singUpPage = new SignUpPage();
	}
	
	@Test
	public void singUp()
	{
		
	homePage.yourListMenu();
	homePage.clickStartHere();
	singUpPage.signUp();
	
	}

}
