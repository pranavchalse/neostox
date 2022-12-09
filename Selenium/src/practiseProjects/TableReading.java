package practiseProjects;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableReading {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goodreturns.in/gold-rates/pune.html");
		Thread.sleep(1000);
		
		List<WebElement> table = driver.findElements(By.xpath("(//table[@cellpadding='1'])[2]//tr"));
		System.out.println("using for loop");
		for(int i=1;i<=table.size()-2;i++)
		{
			WebElement tt = table.get(i);
			System.out.println(tt.getText());
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("using for each loop");
		for(WebElement chalse:table)
		{
			System.out.println(chalse.getText());
			String value = "10 gram ₹ 51,030 ₹ 50,920 ₹ 110";
			if(value.equals(chalse.getText()))
			{
				break;
			}
		}
	}

}
