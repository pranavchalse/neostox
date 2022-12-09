package practiseProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratik {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement text = driver.findElement(By.xpath("//a[text()='About Us']"));
		System.out.println("text is "+text);
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println(driver.findElement(By.xpath("//a[text()='About Us']")).getText());
		System.out.println("(((((((((((())))))))))))))))))");
		WebElement text1 = driver.findElement(By.xpath("//td[contains(text(),'Learn JMETER')]"));
		System.out.println(text1.getText());
	}

}
