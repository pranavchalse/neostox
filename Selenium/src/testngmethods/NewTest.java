package testngmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {

@Test
  public void upstox() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		System.out.println("hi upstox syso printing");
		Reporter.log("hi Upstox Reporter log Printing");
		Reporter.log("hi Upstox Reporter boolen log Printing", true);
	}
  @Test
  public void google() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("hi google syso printing");
		Reporter.log("hi google Reporter log Printing");
		Reporter.log("hi google Reporter boolen log Printing", false);

  }
  
}
