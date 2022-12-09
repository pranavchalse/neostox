package upstoxPOMExcelReading;

import org.testng.annotations.Test;

import genalizemethod.Excel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import upStoxUtility.Utility;
import upstoxBase.Base;

public class TestngTestClassFundsMod5 extends Base {
	
	LoginPage login;
	PasscodePage passcode;
	WelcomePage welcome;
	HomePage homepage;
	FundsPage fundpage;
	String TCID="funds";
	
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
		login.enteruserid(Excel.excelread(0, 0));
		login.enterpword(Excel.excelread(0, 1));
		login.clickSiginButton();
		Reporter.log("sending userName and Password", true);
		Utility.wait(driver, 2000); 
		
		passcode.enterpasscode(Excel.excelread(0, 2));
		Reporter.log("sending passcode", true);  
		Utility.wait(driver, 2000); 
		
		welcome.clicknoImGood();
		Utility.wait(driver, 2000); 
	  }
	@Test
	public void validatefunds() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		homepage.clickonfunds();
		Utility.wait(driver, 2000);
		fundpage.checkingFund();
		Reporter.log("validating fund ", true); 
		Utility.wait(driver, 2000);
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

