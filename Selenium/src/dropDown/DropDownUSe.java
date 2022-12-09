package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUSe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select soption=new Select(dropdown);
		
		soption.selectByVisibleText("Option1");
		Thread.sleep(1000);
		
		soption.selectByValue("option2");
		Thread.sleep(1000);
		
		soption.selectByIndex(3);
		
	}

}
