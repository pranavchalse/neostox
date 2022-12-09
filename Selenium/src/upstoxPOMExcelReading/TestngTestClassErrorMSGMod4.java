package upstoxPOMExcelReading;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import upStoxUtility.Utility;
import upstoxBase.Base;

public class TestngTestClassErrorMSGMod4 extends Base{
 
	LoginPage login;
	@BeforeClass
	public void browserlaunch()
	{
		launchBrowser();
		Reporter.log("Launching browser",true);
		login =new LoginPage(driver);
		
	}
	@BeforeMethod
	public void lgn() throws EncryptedDocumentException, IOException 
	{
		login.enteruserid(Utility.readDataFromExcel(0, 0));
		login.clickSiginButton();
		Utility.wait(driver, 1000);
		
	}
	@Test
	public void ValidatingErrorMSG() 
	{
		WebElement errorbutton = driver.findElement(By.xpath("//button[@type='button']"));
		Assert.assertTrue(errorbutton.isDisplayed(),"error msg not display TC failed ");
		Reporter.log("Showing Error msg TC passed",true);
	}
	@AfterMethod
	public void closeBrowser() 
	{ 
		Utility.wait(driver, 1000);  	 	
		Reporter.log("closing browser....", true); 
		driver.close(); 
	}
}
