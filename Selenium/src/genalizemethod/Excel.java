package genalizemethod;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static String excelread(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\chals\\OneDrive\\Desktop\\practise excel.xlsx");
	    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	    
	    String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
	    return value;
		
	}

}
