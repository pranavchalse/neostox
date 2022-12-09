package upstoxPOMExcelReading;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genalizemethod.Screenshott;
import genalizemethod.Scroll;




public class HomePage

{
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement username;
	@FindBy(id = "funds")private WebElement funds;
	@FindBy(xpath = "//div[text()='Logout']")private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateusername (WebDriver driver,String Str) throws InterruptedException, IOException
	{
		Thread.sleep(6000);
		Scroll.scrollIntoView(driver,username);
		String actualUsername = username.getText();
		String ExpectedUSername =Str;
		Thread.sleep(2000);
		
		
		
		Screenshott.screenshotString(driver, actualUsername);
		
		if(actualUsername.equals(ExpectedUSername))
		{
			Screenshott.screenshotString(driver, actualUsername);
			System.out.println("Actual USername and Expected UserName is same TC is passed");
		}
		else
		{
			System.out.println("Actual USername and Expected UserName is not same TC is failed");
		}
	}	
	public void clickonfunds () throws InterruptedException
	{
		funds.click();
	}
	
	public void LogOutButton() throws InterruptedException
	{
		Thread.sleep(4000);
		username.click();
		Thread.sleep(1000);
		logout.click();
	}
	public String getactualusername(WebDriver driver)
	{
		String Actualuser= username.getText();
		Scroll.scrollIntoView(driver, username);
		return Actualuser;
	}
	

}
