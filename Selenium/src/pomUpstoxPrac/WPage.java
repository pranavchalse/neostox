package pomUpstoxPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WPage 
{
	@FindBy(xpath = "//div[text()='No, I’m good']")private WebElement wlc;
	
	public WPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void wlcpage()
	{
		wlc.click();
	}
	

}
