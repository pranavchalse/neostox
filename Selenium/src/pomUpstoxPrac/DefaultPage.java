package pomUpstoxPrac;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genalizemethod.Screenshott;
import genalizemethod.Scroll;

public class DefaultPage 
{
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement una;
	@FindBy(id = "funds") private WebElement ifun;
	@FindBy(xpath = "//div[text()='Logout']") private WebElement logot;
	
	public DefaultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void una1(WebDriver driver,String name) throws IOException
	{
		Scroll.scrollIntoView(driver, una);
		String ogname=name;
		String ename="Pranav C.";
		
		if(ogname.equals(ename))
		{
			System.out.println("same tc passed");
		}
		else
		{
			System.out.println("not same TC failed");
		}
		Screenshott.screenshotString(driver, ename);
	}
	public void fnd()
	{
		ifun.click();
	}
	
	public void una2()
	{
		una.click();
	}
	public void lg()
	{
		logot.click();
	}
}




