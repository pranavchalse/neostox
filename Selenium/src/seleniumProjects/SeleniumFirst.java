package seleniumProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dominos.co.in/");

	}

}

