package webdriveruse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(5000);
		
		WebElement web=driver.findElement(By.xpath("(//h6[text() = 'Sign In'])[2]"));
		System.out.println("text is "+web.getText());
		
		web.click();
		WebElement getotpbutton=driver.findElement(By.xpath("//button [text()='Get OTP']"));
		boolean otp = getotpbutton.isEnabled();
		System.out.println(otp);
		driver.findElement(By.xpath("//input [@id = 'mobileNumber']")).sendKeys("9999999999");
		Thread.sleep(1000);
		getotpbutton.click();
		
		
	}

}
