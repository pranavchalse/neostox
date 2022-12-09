package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TP {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.name("NewWindow")).click();
		
		String mainpageid = driver.getWindowHandle();
		System.out.println(mainpageid);
		
		Set<String> allpageid = driver.getWindowHandles();
		System.out.println(allpageid);
		
		Iterator<String> it = allpageid.iterator();
		String mainpage = it.next();
		String childpage = it.next();
		driver.switchTo().window(childpage);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Home']")).click();
		Thread.sleep(1000);
		driver.switchTo().window(mainpage);

	}

}
