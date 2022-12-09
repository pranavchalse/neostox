package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		
		WebElement src = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		//1stway
		act.dragAndDrop(src, dest).build().perform();
		
//		//2nd way
//		act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		

	}

}
