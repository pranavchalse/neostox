package practiseProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsmethod {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		for(WebElement img:images)
		{
			System.out.println(img.getText());
		}
	}

}
