package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataReadingEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  
	{
	   File myfile=new File("C:\\Users\\chals\\OneDrive\\Desktop\\stc analysis offline.xlsx");
	   String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
	   System.out.println(value);
	   
	   double value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
	   System.out.println(value1);
	   
	}

}
