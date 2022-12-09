package practiseProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tp6action {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//Thread.sleep(500);
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act=new Actions(driver);
		
//		1st way
//		act.moveToElement(rightclick).perform();
//		act.contextClick().perform();
//		2nd way
//		act.moveToElement(rightclick).contextClick(rightclick).build().perform();
		
//      3rd way		
		act.contextClick(rightclick).perform();
		
	}

}
