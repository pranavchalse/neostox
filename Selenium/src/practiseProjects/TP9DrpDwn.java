package practiseProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TP9DrpDwn {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		
		WebElement date = driver.findElement(By.id("day"));
		Select sdate=new Select(date);
		sdate.selectByVisibleText("11");
		
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select smonth=new Select(month);
		smonth.selectByValue("6");
		
		
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select syear=new Select(year);
		syear.selectByIndex(3);
		
		
		
	}

}
