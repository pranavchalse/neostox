package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		Thread.sleep(2000);
		
        WebDriver Text1 = driver.switchTo().frame("frame1");
		WebElement tt = Text1.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println("text is from frame1:- "+tt.getText());
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();       //navigate to main page 
		
		WebDriver Text2 = driver.switchTo().frame("frame2");
		WebElement tt2 = Text2.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println("text is from frame2:- "+tt2.getText());
		Thread.sleep(1000);
		
	}

}
//(//h1[@id='sampleHeading'])[1]