package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRowCellReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File src=new File("C:\\Users\\chals\\OneDrive\\Desktop\\practise excel.xlsx");
		//boolean value1 = WorkbookFactory.create(src).getSheet("Sheet1").getRow(0).getCell(3).getBooleanCellValue();
		//System.out.println(value1);
		
		
		
		Sheet mysheet = WorkbookFactory.create(src).getSheet("Sheet1");
//		
//		int lastRow = mysheet.getFirstRowNum();
//		System.out.println("first row no. is"+lastRow);
//		short value2 = mysheet.getRow(0).getFirstCellNum();
//		System.out.println("first cell no. is"+value2);
//		
//		Row frow = mysheet.getRow(0);
//		Cell fcell = frow.getCell(1);
//		System.out.println(fcell.getCellType());
//		System.out.println(fcell.getNumericCellValue());
		
		for(int i=0; i<=3;i++)
		{
			for(int j=0; j<=2; j++)
			{
				String value3 = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value3+" ");
			}
			System.out.println();
			
		}
		
		
		
	}

}
