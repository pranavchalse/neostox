package neoStox;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listener.class)
public class NeoStoxTestClass extends NeoStoxBaseClass{

	NeoStoxLoginpage login;
	NeoStoxPasswordPage password;
	NeoStoxWelcomePage wlc;
	NeoStoxHomePage home;
	
	
	@BeforeClass
	public void openbrowser() throws IOException
	{
		launchBrowser();
		login= new NeoStoxLoginpage(driver);
		wlc =new NeoStoxWelcomePage(driver);
		home =new NeoStoxHomePage(driver);
		password =new NeoStoxPasswordPage(driver);
	}
	@BeforeMethod
	public void loginfunctionality() throws IOException, InterruptedException
	{
		login.uid(driver, NeoStoxUtilityClass.ReadDataFromPropertyFile("id"));
		password.pwd(driver, NeoStoxUtilityClass.ReadDataFromPropertyFile("pass"));
		Thread.sleep(5000);
		wlc.buttons();
	}
	@Test
	public void validatingusernameAndFunds() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		Assert.assertEquals(home.getactualusername(driver),NeoStoxUtilityClass.ReadDataFromPropertyFile("actualusername"),"both profilename are not matchiing tc failed");
		Reporter.log("both profilename are  matchiing tc pass",true);
		Thread.sleep(1000);
		home.getAvailableFunds();
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(1000);
		home.logoutbutton(driver);
	}
	@AfterClass()
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(500);
		driver.close();
	}

}
