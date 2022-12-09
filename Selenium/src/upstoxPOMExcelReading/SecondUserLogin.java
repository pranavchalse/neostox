package upstoxPOMExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class SecondUserLogin {

	public static void sdUser(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{
		driver.get("https://login-v2.upstox.com/");
		File myfile1=new File("C:\\Users\\chals\\OneDrive\\Desktop\\practise excel.xlsx");
		Sheet mysheet1 = WorkbookFactory.create(myfile1).getSheet("Sheet3");
		
		LoginPage login1=new LoginPage(driver);
		login1.enteruserid(mysheet1.getRow(1).getCell(0).getStringCellValue());
		login1.enterpword(mysheet1.getRow(1).getCell(1).getStringCellValue());
		login1.clickSiginButton();
		
		Thread.sleep(3000);
		PasscodePage passcode1=new PasscodePage(driver);
		passcode1.enterpasscode(mysheet1.getRow(1).getCell(2).getStringCellValue());
		
//		Thread.sleep(10000);
//		WelcomPage welpage1 = new WelcomPage(driver);
//		welpage1.clicknoImGood();
		
		Thread.sleep(4000);
		HomePage homepage1= new HomePage(driver);
		homepage1.validateusername(driver,mysheet1.getRow(1).getCell(3).getStringCellValue());
		homepage1.clickonfunds();
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		FundsPage fpage1=new FundsPage(driver);
		fpage1.checkingFund();
		Thread.sleep(1000);
		
		homepage1.LogOutButton();
	}
	
}
