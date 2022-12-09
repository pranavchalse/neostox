package upstoxPOMTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		
		LoginPage login=new LoginPage(driver);
		login.enteruserid();
		login.enterpword();
		login.clickSiginButton();
		
		Thread.sleep(3000);
		PasscodePage passcode=new PasscodePage(driver);
		passcode.enterpasscode();
		
		Thread.sleep(10000);
		WelcomPage welpage = new WelcomPage(driver);
		welpage.clicknoImGood();
		
		Thread.sleep(4000);
		HomePage hompage= new HomePage(driver);
		hompage.validateusername(driver);
		hompage.clickonfunds();
		
		Thread.sleep(5000);
		FundsPage fpage=new FundsPage(driver);
		fpage.checkingFund();
		
	
	}
	

}
