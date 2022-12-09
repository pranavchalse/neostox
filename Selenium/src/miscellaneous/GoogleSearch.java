package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("ipho");
		Thread.sleep(500);
		List<WebElement> searchsuggest = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		Thread.sleep(1000);
		for(WebElement search:searchsuggest)
		{
			System.out.println(search.getText());
			Thread.sleep(500);
		//get iphone suggesetion list and select one suggestion	
			String Result="iphone 11";
			if(Result.equals(search.getText()))
			{
				search.click();
				driver.findElement(By.xpath("//a[text()='Images']")).click();
				Thread.sleep(1000);
		//how many iphone imgs are available
				List<WebElement> imgs = driver.findElements(By.tagName("img"));
				System.out.println(imgs.size());
				break;
			}
		}
	}

}
