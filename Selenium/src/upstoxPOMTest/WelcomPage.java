package upstoxPOMTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomPage 
{
	@FindBy(xpath = "//div[text()='No, I’m good']")private WebElement noImGood;
	
	public WelcomPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clicknoImGood()
	{
		noImGood.click();
	}
}
