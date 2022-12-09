package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	//click
	//sendkeys
	//clear
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chalsepranav11@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9011973964");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Shivaji@11");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class= '_9lsa']")).click();
		
		
		

	}

}
