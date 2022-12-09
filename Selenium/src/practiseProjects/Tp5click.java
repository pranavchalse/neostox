package practiseProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tp5click {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@type = 'button']")).click();
		
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@title = 'Change Theme'])[1]")).click();

	}

}
