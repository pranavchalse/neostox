package upstoxPOMExcelReading;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import upStoxUtility.Utility;
import upstoxBase.Base;

public class TestngTestClassUserNameMod6 extends Base {
	
	LoginPage login;
	PasscodePage passcode;
	WelcomePage welcome;
	HomePage homepage;
	FundsPage fundpage;
	String TCID="4019";
	
	@BeforeClass
	  public void browserLaunch()
	  {
		launchBrowser();
		Reporter.log("Launching browser",true);
		login =new LoginPage(driver);
		passcode =new PasscodePage(driver);
		welcome =new WelcomePage(driver);
		homepage =new HomePage(driver);
		fundpage =new  FundsPage(driver);
		
	  }
	@BeforeMethod
	  public void loginFunc() throws EncryptedDocumentException, IOException, InterruptedException
	  {
		Thread.sleep(1000);
		login.enteruserid(Utility.ReadDataFromPropertyFile("userid"));
		login.enterpword(Utility.ReadDataFromPropertyFile("PWD"));
		login.clickSiginButton();
		Reporter.log("sending userName and Password", true);
		Utility.wait(driver, 2000); 
		
		passcode.enterpasscode(Utility.ReadDataFromPropertyFile("passcode"));
		Reporter.log("sending passcode", true);  
		Utility.wait(driver, 2000); 
		
		welcome.clicknoImGood();
		Utility.wait(driver, 2000); 
	  }
	@Test
	public void validateUserid() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		Thread.sleep(1000);
		Assert.assertEquals(homepage.getactualusername(driver),Utility.ReadDataFromPropertyFile("expusername"));
		Reporter.log("validating userName and Taking screenshot", true); 
		Utility.screenshot(driver, TCID);
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		homepage.LogOutButton();
	}
	@AfterClass 
		public void closeBrowser() 
	{ 
		Utility.wait(driver, 1000);  	 	
		Reporter.log("closing browser....", true); 
		driver.close(); 
	} 

  
}
