package neoStox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxWelcomePage 
{
	@FindBy(xpath = "(//a[text()='OK'])[2]")private WebElement okbutton;
	@FindBy(xpath = "(//a[text()='Close'])[5]")private WebElement closebutton;
	
	public NeoStoxWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void buttons() throws InterruptedException
	{
		okbutton.click();
		Reporter.log("clicking on ok button ",true);
		Thread.sleep(500);
		Reporter.log("clicking on close button ",true);
		closebutton.click();
	}

}
