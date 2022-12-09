package upstoxPOMExcelReading;


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
	
	public void enteruserid(String uid)
	{
		userid.sendKeys(uid);
	}
	public void enterpword(String Pwd)
	{
		pword.sendKeys(Pwd);
	}
	public void clickSiginButton()
	{
		signInButton.click();
	}
	
	

}