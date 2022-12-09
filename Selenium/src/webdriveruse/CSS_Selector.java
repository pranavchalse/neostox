package webdriveruse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input#pass")).sendKeys("pppp");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("pppp");
		
		

	}

}
