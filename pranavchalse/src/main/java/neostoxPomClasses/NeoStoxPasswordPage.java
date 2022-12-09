package neostoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxPasswordPage 
{
	@FindBy(id = "txt_accesspin")private WebElement password;
	@FindBy(id = "lnk_submitaccesspin")private WebElement submit;
	
	public NeoStoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void pwd(WebDriver driver,String Passd) throws InterruptedException
	{
		password.sendKeys(Passd);
		Reporter.log("sending password",true);
		Thread.sleep(1000);
		Reporter.log("clicking on signupbutton",true);
		submit.click();
	}

}
