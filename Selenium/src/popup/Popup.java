package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewTab")).click();
		String newtab = driver.getWindowHandle();
		System.out.println(newtab);
		
		Set<String> allpage = driver.getWindowHandles();
		Iterator<String> ids = allpage.iterator();
		Thread.sleep(2000);
		String mainpage = ids.next();
		String childpage = ids.next();
		Thread.sleep(3000);
		driver.switchTo().window(childpage);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='HOME']")).click();
		Thread.sleep(500);
		driver.close();
		
		driver.switchTo().window(mainpage);
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> allpage1 = driver.getWindowHandles();
		Iterator<String> ids1 = allpage1.iterator();
		ids1.next();
		Thread.sleep(2000);
		String childpage1 = ids1.next();
		driver.switchTo().window(childpage1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Home']")).click();
		Thread.sleep(500);
		driver.close();
		
	}

}
