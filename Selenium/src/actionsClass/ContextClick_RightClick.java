package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_RightClick {
public static void main(String[] args) throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);

//1.find Element to be handled and store in ref variable
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));

//2.create an object of Actions class and pass driver object as a parameter
		Actions act= new Actions(driver);

//3.Using one of the Actions class methods, take required action

//1st way
 	act.moveToElement(rightClickButton).perform();
 	act.contextClick().perform();
		
//2nd way
// 	act.moveToElement(rightClickButton).contextClick().build().perform();
		
//3rd way
	//	act.contextClick(rightClickButton).perform();
	}
}