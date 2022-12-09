package upstoxPOMExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		
		File myfile=new File("C:\\Users\\chals\\OneDrive\\Desktop\\practise excel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		LoginPage login=new LoginPage(driver);
		login.enteruserid(mysheet.getRow(0).getCell(0).getStringCellValue());
		login.enterpword(mysheet.getRow(0).getCell(1).getStringCellValue());
		login.clickSiginButton();
		
		Thread.sleep(3000);
		PasscodePage passcode=new PasscodePage(driver);
		passcode.enterpasscode(mysheet.getRow(0).getCell(2).getStringCellValue());
		
		Thread.sleep(10000);
		WelcomePage welpage = new WelcomePage(driver);
		welpage.clicknoImGood();
		
		Thread.sleep(4000);
		HomePage homepage= new HomePage(driver);
		homepage.validateusername(driver,mysheet.getRow(0).getCell(3).getStringCellValue());
		homepage.clickonfunds();
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		FundsPage fpage=new FundsPage(driver);
		fpage.checkingFund();
		Thread.sleep(1000);
		
		homepage.LogOutButton();
		Thread.sleep(2000);
		System.out.println("+++++++++++++++++++++++++++++++++");
		SecondUserLogin.sdUser(driver);
		
	
	}
	

}
