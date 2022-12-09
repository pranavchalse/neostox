package practiseProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PratikChalse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("chalsepranav11@gmail.com");
		Thread.sleep(1000);
		email.clear();
		Thread.sleep(500);
		email.sendKeys("9011973964");
		
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456789");
		Thread.sleep(1000);
		
		String text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).getText();
		System.out.println("Text is "+text);
		
		WebElement text1 = driver.findElement(By.name("login"));
		System.out.println(text1.getText());
		text1.click();
		driver.findElement(By.name("login")).click();
		
		driver.get("https://www.facebook.com/");
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		String title = driver.getTitle();
		System.out.println(title);

	}

}
