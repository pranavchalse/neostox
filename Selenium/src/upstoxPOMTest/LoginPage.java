package upstoxPOMTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id = "userCode") private WebElement userid;
	@FindBy(name  = "password") private WebElement pword;
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement signInButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enteruserid()
	{
		userid.sendKeys("CZ7399");
	}
	public void enterpword()
	{
		pword.sendKeys("Shivaji@11");
	}
	public void clickSiginButton()
	{
		signInButton.click();
	}
	
	

}