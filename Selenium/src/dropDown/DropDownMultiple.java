package dropDown;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultiple {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
		WebElement multiselction = driver.findElement(By.id("cars"));
		
		Select multiple=new Select (multiselction);
		System.out.println(multiple.isMultiple());
		
		multiple.selectByValue("volvo");
		multiple.selectByValue("saab");
		multiple.selectByValue("audi");
		
		multiple.deselectByIndex(0);
		multiple.deselectAll();
		
				
		
	}

}
