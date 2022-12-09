package genalizemethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClasss {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://vctcpune.com/");
//		WebElement object = driver.findElement(By.xpath("//h1[text()='Our Social Media']"));
//		String ob = object.getText();
//		Thread.sleep(2000);
//		Scroll.scrollIntoView(driver, object);
//		  
//		Thread.sleep(1000);
//		Screenshott.screenshotString(driver, ob);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys(Excel.excelread(0, 0));
		String ex = Excel.excelread(0, 0);
		System.out.println(ex);

	}

}
