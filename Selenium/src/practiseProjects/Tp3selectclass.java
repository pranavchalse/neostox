package practiseProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Tp3selectclass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\selinium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pranav");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("chalse");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("chalsepranav11@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Shivaji@11");
		Thread.sleep(1000);
		
		
		WebElement sday=driver.findElement(By.id("day"));
		Select sday1=new Select(sday);
		sday1.selectByIndex(10);
		
		WebElement smonth=driver.findElement(By.id("month"));
		Select smonth1=new Select(smonth);
		smonth1.selectByValue("6");
		
		WebElement syear=driver.findElement(By.id("year"));
		Select syear1=new Select(syear);
		syear1.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("//label[text()= 'Male']")).click();
		Thread.sleep(1000);
		
		
	}

}