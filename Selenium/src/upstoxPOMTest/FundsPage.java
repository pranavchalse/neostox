package upstoxPOMTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundsPage 
{
	@FindBy(xpath = "((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")private WebElement myfunds;
	public FundsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkingFund()
	{
		String funds = myfunds.getText();
		System.out.println("Available to trade"+funds);
	}

}
