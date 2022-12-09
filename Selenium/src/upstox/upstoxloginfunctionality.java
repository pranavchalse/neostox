package upstox;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genalizemethod.Screenshott;
import genalizemethod.Scroll;

public class upstoxloginfunctionality {
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		//driver.manage().window().maximize();
		
		//entering login id 
		driver.findElement(By.id("userCode")).sendKeys("CZ7399");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		//entering password
		driver.findElement(By.name("password")).sendKeys("Shivaji@11");
		
		//clicking to submit button
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
		driver.findElement(By.id("submit-btn")).click();
		
		//navigating to nextpage and entering passcode
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.id("yob")).sendKeys("1999");
		
		//clicking on 'No, I’m good'
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	
		//validating user name
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		WebElement actusername = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]"));
		//using generalize class and creating scrollintoview method and directly scroll on webelement
		Scroll.scrollIntoView(driver, actusername);
		
		String ExpUserName ="Pranav C.";
		if(actusername.getText().equals(ExpUserName))
		{
			System.out.println("actual usermame and Expected username is match");
		}
		else
		{
			System.out.println("actual usermame and Expected username is not match");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		//validating funds
		driver.findElement(By.id("funds")).click();
		WebElement fundsprice = driver.findElement(By.xpath("((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]"));
		System.out.println("funds avalible for trade"+fundsprice.getText());
		Screenshott.screenshotString(driver, "upstox"+ExpUserName);
	}

}
