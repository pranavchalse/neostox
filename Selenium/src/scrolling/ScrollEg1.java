package scrolling;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class ScrollEg1 {
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\selinium\\chromedriver.exe" );
			WebDriver driver= new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://paytm.com/");
			
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(1000,800)");
			Thread.sleep(2000);
//			js.executeScript("window.scrollBy(1000,800)");
//			Thread.sleep(2000);
			js.executeScript("window.scrollBy(1000,-500)");
		}
}
