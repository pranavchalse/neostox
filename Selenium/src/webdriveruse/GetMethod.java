package webdriveruse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		driver.get("https://drive.google.com/drive/u/0/my-drive");
		
		//driver.quit();
		driver.manage().window().minimize();
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text() = 'Next']")).click();
		driver.quit();
	}

}
