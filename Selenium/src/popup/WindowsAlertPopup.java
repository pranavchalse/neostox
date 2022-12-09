package popup;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowsAlertPopup {
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		
		String mainpgid = driver.getWindowHandle();
		System.out.println(mainpgid);
		
		Set<String> allpage = driver.getWindowHandles();
//get ids using for each loop
		for(String id0:allpage)
		{
			System.out.println(id0);
		}
//switch to child page and click to home option and then close child page
		Iterator<String> ids = allpage.iterator();
		
		String mainpage = ids.next();
		Thread.sleep(2000);
		
		String childpage = ids.next();
		
		driver.switchTo().window(childpage);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Home']")).click();
		Thread.sleep(500);
		driver.close();
		Thread.sleep(1000);

		
//back to main page &switch to newtab & click on training option & close newtab
	
		driver.switchTo().window(mainpage);
		
		Thread.sleep(1000);
		driver.findElement(By.name("NewTab")).click();
	//	Thread.sleep(5000);
		Set<String> newtab = driver.getWindowHandles();
		Iterator<String> tab = newtab.iterator();
		tab.next();
		String secondtab = tab.next();
		Thread.sleep(2000);
		driver.switchTo().window(secondtab);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		driver.close();
	}

}
