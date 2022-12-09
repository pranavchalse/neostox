package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		
		WebElement element = driver.findElement(By.xpath("(//div[@class='IA_rP'])[3]"));
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(2000));
		w.until(ExpectedConditions.visibilityOf(element));
		element.click();
		
	}

}
