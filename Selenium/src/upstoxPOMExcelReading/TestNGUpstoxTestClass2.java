package upstoxPOMExcelReading;

import org.testng.annotations.Test;

import genalizemethod.Screenshott;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNGUpstoxTestClass2 {
	WebDriver driver=null;
	LoginPage login;
	PasscodePage passcode;
	WelcomePage wlc;
	HomePage hp;
	FundsPage fp;
	File myfile;
	Sheet mysheet;
	
	
@BeforeClass
  public void browserLaunch()
  {
	System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://login-v2.upstox.com/");
	login =new LoginPage(driver);
	passcode =new PasscodePage(driver);
	wlc =new WelcomePage(driver);
	hp =new HomePage(driver);
	fp =new  FundsPage(driver);
	
	
  }
@BeforeMethod
  public void loginFunc() throws EncryptedDocumentException, IOException, InterruptedException
  {
	Thread.sleep(1000);
	File myfile=new File("C:\\Users\\chals\\OneDrive\\Desktop\\practise excel.xlsx");
	Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	login.enteruserid(mysheet.getRow(0).getCell(0).getStringCellValue());
	login.enterpword(mysheet.getRow(0).getCell(1).getStringCellValue());
	login.clickSiginButton();
	Thread.sleep(2000);
	passcode.enterpasscode(mysheet.getRow(0).getCell(2).getStringCellValue());
	Thread.sleep(10000);
	wlc.clicknoImGood();
  }
	@Test
  public void validateUserid() throws EncryptedDocumentException, IOException, InterruptedException 
  {
		File myfile=new File("C:\\Users\\chals\\OneDrive\\Desktop\\practise excel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		String expectUID =mysheet.getRow(0).getCell(3).getStringCellValue();
		String actualUID = hp.getactualusername(driver);
		
		Thread.sleep(1000);
		Assert.assertEquals(actualUID, expectUID,"actual userid and expected userid not match, TC failed");
		
		
		/*  here i'm not scrolling
		 *  because scrolling action performs only on webelements
		 *  & here actual username data type is string 
		 *  so for scrolling make the changes 
		 *  like convert the data type String into WebElment*/
		
		

		Screenshott.screenshotString(driver, actualUID);
		Thread.sleep(2000);
  }
@AfterMethod
  public void logout() throws InterruptedException
  {
	Thread.sleep(3000);
	hp.LogOutButton();
	
  }
@AfterClass
public void closeBrowser() throws InterruptedException
  {
	Thread.sleep(1000);
	driver.close();
  }

}


/*  here i'm not scrolling
 *  because scrolling action performs only on webelements
 *  & here actual username data type is string 
 *  so for scrolling make the changes 
 *  like convert the data type String into WebElment*/
