package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableReading {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("the total no of rows:- "+rows.size());
		
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='product']//tr/th"));
		System.out.println("the no. of columns:- "+columns.size());
		
		List<WebElement> data = driver.findElements(By.xpath("//table[@id='product']//tr"));
		for(WebElement tdata:data)
		{
			System.out.println(tdata.getText());
		}
	}

}
