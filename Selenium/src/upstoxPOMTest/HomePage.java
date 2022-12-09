package upstoxPOMTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genalizemethod.Scroll;



public class HomePage

{
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement username;
	@FindBy(id = "funds")private WebElement funds;
	@FindBy(xpath = "")private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateusername (WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		Scroll.scrollIntoView(driver,username);
		String actualUsername = username.getText();
		String ExpectedUSername ="Pranav C.";
		Thread.sleep(2000);
		
		if(actualUsername.equals(ExpectedUSername))
		{
			System.out.println("Actual USername and Expected UserName is same TC is passed");
		}
		else
		{
			System.out.println("Actual USername and Expected UserName is not same TC is failed");
		}
		Thread.sleep(1000);
	}
	public void clickonfunds ()
	{
		funds.click();
		username.click();
		//perform logout 
	}

}
