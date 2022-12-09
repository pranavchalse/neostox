package pomUpstoxPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FourDigitPassCodePage 
{
	@FindBy(name = "yob")private WebElement pass;
	
	public FourDigitPassCodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void PC(String PCODE)
	{
		pass.sendKeys(PCODE);
	}

}
