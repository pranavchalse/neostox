package practiseProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tp7RiclickDClick {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//1st find element and store it into the ref variable 
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//create an object of action class and pass webdriver arguments 
		Actions act=new Actions(driver);
		Thread.sleep(500);
		
		//after every actions in actions class need to get .perform
		//1stway   //1st move cursor and click
//		act.moveToElement(rightclick).perform();
//		act.contextClick().perform();
		
		//2ndway  //combine two methods and use build 
		//act.moveToElement(rightclick).contextClick().build().perform();
		
		//3rd way  //usinf actions class object call action class method
		act.contextClick(rightclick).perform();

	}

}
