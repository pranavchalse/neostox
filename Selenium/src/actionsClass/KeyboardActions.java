package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();      
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.id("day"));
		date.click();
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		
		//1stway
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ENTER).perform();
		
////		2ndway
		for(int i=0;i<=14;i++)
		{
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(400);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).click();
		Thread.sleep(1000);
		act.keyDown(Keys.SHIFT).sendKeys("pra").keyUp(Keys.SHIFT).sendKeys("nav").build().perform();
		
		
	}

}
