package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUSe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value ='Hide']")).click();
		Thread.sleep(1000);
		WebElement checkbox = driver.findElement(By.xpath("//input[@placeholder ='Hide/Show Example']"));
		
		System.out.println(checkbox.isDisplayed());

	}

}
