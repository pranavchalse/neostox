package pomUpstoxPrac;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genalizemethod.Screenshott;



public class Fpage 
{
	
		@FindBy(xpath = "((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div//div)[2]")private WebElement ffpage;
		
		public Fpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void PC(WebDriver driver,String str) throws IOException
		{
			System.out.println(ffpage.getText());
			Screenshott.screenshotString(driver, str);
		}

	

}











//funds=
