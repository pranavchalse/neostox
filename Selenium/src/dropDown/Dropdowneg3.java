package dropDown;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowneg3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Thread.sleep(1000);
		Select sday=new Select(day);
		sday.selectByValue("15");
		
		Select smonth=new Select(month);
		smonth.selectByVisibleText("Mar");

		System.out.println("+++++++++++++++++++++++=");
		
		List<WebElement> date = sday.getOptions();
		List<WebElement> almonth = smonth.getOptions();
		System.out.println("++++++++foreach+++++++=");
		for(WebElement allday:date)
		{
			System.out.println(allday.getText());
		}
		System.out.println("++++++++forloop+++++++=");
		for(int i=0; i<=date.size()-1;i++)
		{
			System.out.println(date.get(i).getText());
		}
		System.out.println("++++++++iterator+++++++=");
		
		Iterator<WebElement> aday = date.iterator();
		while(aday.hasNext())
		{
			System.out.println(aday.next().getText());
		}
		System.out.println("++++++++Listiterator+++++++=");
		
		Iterator<WebElement> aaday = date.listIterator();
		while(aaday.hasNext())
		{
			System.out.println(aaday.next().getText());
		}
		System.out.println("++++++++foreachMonth+++++++=");
		
		for(WebElement mm:almonth)
		{
			System.out.println(mm.getText());
		}
		System.out.println("++++++++forloopMonth+++++++=");
		
		for(int i=0; i<=almonth.size()-1;i++)
		{
			System.out.println(almonth.get(i).getText());
		}
		System.out.println("++++++++iteratorMonth+++++++=");
		
		Iterator<WebElement> mnt = almonth.iterator();
		while(mnt.hasNext())
		{
			System.out.println(mnt.next().getText());
		}
		System.out.println("++++++++ListiteratorMonth+++++++=");
		
		Iterator<WebElement> mnt1 = almonth.listIterator();
		while(mnt1.hasNext())
		{
			System.out.println(mnt1.next().getText());
		}
	}

}
