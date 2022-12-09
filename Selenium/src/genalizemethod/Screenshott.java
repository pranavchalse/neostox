package genalizemethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshott 
{
	public static void screenshotString(WebDriver driver,String str) throws IOException
	{
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\selinium\\ss\\"+str+".jpeg");
		FileHandler.copy(Source, destination);
		
	}
}
