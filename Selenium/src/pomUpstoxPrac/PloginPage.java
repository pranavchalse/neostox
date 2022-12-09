package pomUpstoxPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PloginPage 
{
	@FindBy(id = "userCode")private WebElement UID;
	@FindBy(name = "password")private WebElement PWD;
	@FindBy(xpath = "//div[text()='Sign into Upstox']")private WebElement Button;
	
	public PloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void log(String UserId) throws InterruptedException
	{
		UID.sendKeys(UserId);
	}
	public void PASSword(String ppwrd) throws InterruptedException
	{
		PWD.sendKeys(ppwrd);
	}
	public void signbutton() throws InterruptedException
	{
		Button.click();
	}
}


	







//
//
//