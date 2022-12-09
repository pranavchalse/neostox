package webdriveruse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitileMethodUse {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
	    String abc = driver.getTitle();
        System.out.println("link title is "+abc);
	}

}
