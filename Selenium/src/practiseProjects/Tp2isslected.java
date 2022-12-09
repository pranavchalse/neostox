package practiseProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tp2isslected {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains (@id,'u_0_0_')]")).click();
		
		Thread.sleep(2000);
		
		WebElement female = driver.findElement(By.xpath("//label[text()='Female']"));
		//System.out.println(female.isSelected());
		
		female.click();
		Thread.sleep(2000);
		
		System.out.println(female.isSelected());
		female.click();
	}
	
}
