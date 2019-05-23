package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	 static public WebDriver driver;
	 static public Properties prop;
	
	public void initilization() 
	{
		
		prop=new Properties();
		
		try {
			FileInputStream fis=new FileInputStream(".\\src\\main\\java\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String browser=prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","d:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

}
