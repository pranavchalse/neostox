package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		String parenttext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println("parent text:- "+parenttext);
		
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		Thread.sleep(1000);
		String childtext = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println("child text:- "+childtext);
	}

}
