package pomUpstoxPrac;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class TestUser2 
{
	public static void user2(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException
	{
		File upstoxfile=new File("C:\\Users\\chals\\OneDrive\\Desktop\\practise excel.xlsx");
		Sheet upstoxsheet = WorkbookFactory.create(upstoxfile).getSheet("Sheet3");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//loginpage objcet
		PloginPage pp=new PloginPage(driver);
		pp.log(upstoxsheet.getRow(1).getCell(0).getStringCellValue());
		pp.PASSword(upstoxsheet.getRow(1).getCell(1).getStringCellValue());
		pp.signbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//passcodepage object
		FourDigitPassCodePage ppcc=new FourDigitPassCodePage(driver);
		ppcc.PC(upstoxsheet.getRow(1).getCell(2).getStringCellValue());
		
		Thread.sleep(10000);
		//wpage object
		WPage ww=new WPage(driver);
		ww.wlcpage();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		//defaultpage object
		DefaultPage dd=new DefaultPage(driver);
		dd.una1(driver, upstoxsheet.getRow(1).getCell(3).getStringCellValue());
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		dd.fnd();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//Fpage object
		Fpage ff=new Fpage(driver);
		ff.PC(driver, "fundapage");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//for logout
		dd.una2();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		dd.lg();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.close();
	}

}
