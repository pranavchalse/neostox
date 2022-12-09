package neoStox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxLoginpage 
{
	@FindBy(id = "MainContent_signinsignup_txt_mobilenumber")private WebElement username;
	@FindBy(id = "lnk_signup1")private WebElement signupbutton;
	
	public NeoStoxLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void uid(WebDriver driver, String userid)
	{
		username.sendKeys(userid);
		Reporter.log("sending username",true);
		signupbutton.click();
		Reporter.log("clicking on signupbutton",true);
		NeoStoxUtilityClass.wait(driver,1000);	
	}
}
