package screenshot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import net.bytebuddy.utility.RandomString;



public class SsUSe {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//1st need to type casting 
		//2nd need to call ab function "getSsAs" ther we need to pass as argument
		//3rd it take ss but temp
		driver.findElement(By.id("email")).sendKeys("pranav");
		
		String str = RandomString.make(3);
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			
		File destination = new File("C:\\selinium\\ss\\pranav"+str+".jpeg");
		FileHandler.copy(Source, destination);
	}

}
