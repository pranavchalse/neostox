package practiseProjects;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Tp8SS {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://meet.google.com/");
		
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 String str = RandomString.make(3);
		
		 File destination = new File("C:\\selinium\\ss\\chalse"+str+".jpeg");
		 FileHandler.copy(source, destination);
	}

}
