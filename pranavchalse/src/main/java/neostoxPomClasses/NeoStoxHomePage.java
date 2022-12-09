package neostoxPomClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxHomePage 
{
	@FindBy(id = "lbl_username")private WebElement profilename;
	@FindBy(xpath = "(//span[@class='righttopmenu1'])[2]")private WebElement fund;
	@FindBy(xpath = "//span[text()='Logout']")private WebElement logoutbutton;
	
	public NeoStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getactualusername(WebDriver driver) throws IOException
	{
		String un = profilename.getText();
		Reporter.log("getting text from profilename",true);
		NeoStoxUtilityClass.screenshot(driver, un);
		Reporter.log("takong ScreenShot of homepage",true);
		return un;
	}
	public void getAvailableFunds()
	{
		System.out.println(fund.getText());
		Reporter.log("getting fund from available fund",true);
		
	}
	
	public void logoutbutton(WebDriver driver)
	{
		profilename.click();
		Reporter.log("clicking on profile name",true);
		NeoStoxUtilityClass.wait(driver, 1000);
		Reporter.log("clicking on logoutbutton",true);
		logoutbutton.click();
	}
}
