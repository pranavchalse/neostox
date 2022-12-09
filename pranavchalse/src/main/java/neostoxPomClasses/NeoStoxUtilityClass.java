package neostoxPomClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class NeoStoxUtilityClass 
{
	    //excel 
	 	//screenshot 
	 	//scrolling 
	 	//wait 
	 	 
	 public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException 
	 { 
		 File myFile= new File("C:\\Users\\chals\\OneDrive\\Desktop\\practise excel.xlsx"); 
	 	 Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");  	 	 
	 	 String value = mySheet.getRow(row).getCell(cell).getStringCellValue(); 
	 	 return value; 
	 } 
	 
	 public static void screenshot(WebDriver driver, String key) throws IOException 
	 { 
		 key=RandomString.make();
	 	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	 	 File dest= new File("C:\\selinium\\ss\\"+key+".jpeg"); 
	 	 FileHandler.copy(src, dest); 
	 }
	 
	 public static void wait(WebDriver driver, int waitTime) 
	 { 
	 		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime)); 
	 } 
	 	 
	 public static void scrollIntoView(WebDriver driver,WebElement element) 
	 { 
	  	JavascriptExecutor js = (JavascriptExecutor)driver; 
	 	js.executeScript("arguments[0].scrollIntoView()", element); 
	 } 
	 
	 public static String ReadDataFromPropertyFile(String key) throws IOException
	 {
		 Properties prop= new Properties();
		 FileInputStream myfile=new FileInputStream("C:\\Users\\chals\\eclipse-workspace\\Selenium\\src\\neoStox\\NeoStoxPropertyfile.properties");
		 prop.load(myfile);
	     String value = prop.getProperty(key);
		 return value;
	 }
	 	 
} 




