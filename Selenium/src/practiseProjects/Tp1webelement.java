package practiseProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tp1webelement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl(); 
		System.out.println("url is "+url);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chalsepranav11@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9011973964");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("shivaji@11");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class= '_9lsa']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name= 'login']")).click();
		Thread.sleep(10000);
		driver.close();
	}

}
