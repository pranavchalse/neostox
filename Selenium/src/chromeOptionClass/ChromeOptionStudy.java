package chromeOptionClass;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		ChromeOptions Chopt=new ChromeOptions();
		Chopt.addArguments("--start-maximized");
		Chopt.addArguments("--Incognito");
		Chopt.addArguments("--disable-notifications");
		Chopt.addArguments("--headless");
		Chopt.addArguments("version").getBrowserVersion();
		Chopt.addArguments("test-type=browser");
		Chopt.addArguments("disable-infobars");
		
	
		
		
		WebDriver driver=new ChromeDriver(Chopt);
		driver.get("http://demo.guru99.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		String title = driver.getTitle();
		System.out.println("Page Title: " +title);
		//Thread.sleep(1000);
		driver.quit();
		//-------------------//////////////////---------------------
//		options.AddArgument("--ignore-certificate-errors");
//		options.AddArgument("--disable-popup-blocking");
//		options.AddArguments("test-type");

	}

}
