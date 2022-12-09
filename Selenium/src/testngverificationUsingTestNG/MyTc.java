package testngverificationUsingTestNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class MyTc {
  @Test
  public void verifyCheckBox() throws InterruptedException
  {
  
	  System.setProperty("webdriver.chrome.driver","C:\\selinium\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
//	  driver.manage().window().maximize();
//	  driver.get("https://vctcpune.com/selenium/practice.html");
//	  WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
 // 	if(checkBox1.isSelected())
 // 	{
 // 		Reporter.log("CheckBox is selected TC is PASSED",true);
 // 	}
 //
 // 	else 
 //	  	{
 //		    Reporter.log("CheckBox is not selected TC is FAILED",true);
 //
 // 	}
  
//	  checkBox1.click();
//	  Assert.assertTrue(checkBox1.isSelected(),"CheckBox is not selected TC is failed");
	 driver.get("https://login-v2.upstox.com/");
	 Thread.sleep(1000);
	 driver.findElement(By.id("userCode")).sendKeys("Cz7399");
	 driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
	 Thread.sleep(500);
	WebElement zz = driver.findElement(By.xpath("(//div[@class='_2aRKi1erHr_eIGUOCnH8O_ _3mBL_glPXuEkR40a27pSJz'])[2]"));
System.out.println(zz.isDisplayed());

//	assertTrue(zz.isDisplayed(),"tc failed");
//	Reporter.log("tc passed");
  }
 }


