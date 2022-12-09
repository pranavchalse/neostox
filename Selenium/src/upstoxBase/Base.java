package upstoxBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import upStoxUtility.Utility;

public class Base 
{
	protected WebDriver driver;  	
	public void launchBrowser() 
 	{ 
 	 	System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe"); 
 	 	driver= new ChromeDriver();  	 	
 	 	driver.get("https://login-v2.upstox.com/");
 	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
 	} 
	public void launchBrowser1() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe"); 
 	 	driver= new ChromeDriver();  
 	 	driver.get(Utility.ReadDataFromPropertyFile("url"));
 	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}


}
