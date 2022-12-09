package neoStox;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import genalizemethod.Excel;

public class Tp {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		ChromeOptions Chopt=new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		Chopt.addArguments("--Incognito");
		WebDriver driver=new ChromeDriver(Chopt);
		

		driver.get("https://neostox.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("MainContent_signinsignup_txt_mobilenumber")).sendKeys(Excel.excelread(2, 0));
		driver.findElement(By.id("lnk_signup1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("txt_accesspin")).sendKeys(Excel.excelread(2, 1));
		Thread.sleep(500);
		driver.findElement(By.id("lnk_submitaccesspin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
		
		
		Thread.sleep(1000);
		String actualusername = driver.findElement(By.id("lbl_username")).getText();
		System.out.println(actualusername);
		String expectedusername= "Hi VCTC_09_Jul C_Pranav Jagdish Chalse ";
		
		if(actualusername.equals(expectedusername))
		{
			System.out.println("name matching TC pass");
		}
		else
		{
			System.out.println("names r not matching TC fail");
		}
		///////////////////////////////////////////////////////////////////////
		if(actualusername.equals(Excel.excelread(2, 2)))
		{
			System.out.println("name matching TC pass");
		}
		else
		{
			System.out.println("names r not matching TC fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
