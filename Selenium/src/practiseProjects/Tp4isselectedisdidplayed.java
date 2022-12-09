package practiseProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tp4isselectedisdidplayed {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().minimize();
		Thread.sleep(500);
		driver.manage().window().maximize();
		
		System.out.println("the url is "+driver.getCurrentUrl());
		System.out.println("the title is "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pranav chalse");
		
		WebElement Radio1 = driver.findElement(By.xpath("//label[text()='Radio1']"));
		System.out.println(Radio1.isSelected());            //false
		Thread.sleep(5000);         
		Radio1.click();
		System.out.println(Radio1.isSelected());            //true
		Thread.sleep(1000);
		
		WebElement display = driver.findElement(By.xpath("//input[@id='name']"));
		System.out.println(display.isDisplayed());          //true 
		Thread.sleep(2000);
		display.sendKeys("chalse pranav");
		System.out.println(display.isDisplayed());         //true
		Thread.sleep(2000);
		display.clear();
		Thread.sleep(2000);
		System.out.println(display.isDisplayed());         //true
		Thread.sleep(2000);
		
		WebElement box = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		System.out.println(box.isEnabled());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		Thread.sleep(5000);
		System.out.println(box.isEnabled());
		
		

	}

}
