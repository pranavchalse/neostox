package webdriveruse;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl(); 
		System.out.println("url is "+url);
		
	
		
		
	}

}
