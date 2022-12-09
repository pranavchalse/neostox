package scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		
			System.out.println(driver.manage().window().getPosition());
		
		Thread.sleep(300);
		
		//To set Position--> use Point class and create object of Point class
	
			Point p = new Point(800, 500);		
			driver.manage().window().setPosition(p);
			System.out.println(driver.manage().window().getPosition());

		
	}

}
