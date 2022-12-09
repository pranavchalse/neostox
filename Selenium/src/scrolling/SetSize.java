package scrolling;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		
		System.out.println(driver.manage().window().getSize());
	
		Dimension d=new Dimension(1000, 10000);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		
	
	}

}
