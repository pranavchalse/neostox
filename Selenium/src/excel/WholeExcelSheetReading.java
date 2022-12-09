package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WholeExcelSheetReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\chals\\OneDrive\\Desktop\\practise excel.xlsx");
		
		Sheet mysheet1 = WorkbookFactory.create(myfile).getSheet("Sheet1");
		Row myrow = mysheet1.getRow(0);
		Cell mycell = myrow.getCell(0);
		CellType value = mycell.getCellType();
		
		int a = mysheet1.getLastRowNum();
		System.out.println("last row is:- "+a);
		System.out.println("====================");
		
		System.out.println("value type is "+value);
		String value1 = mycell.getStringCellValue();
		System.out.println("value is "+value1);
		
		System.out.println("====cell reading====");
		for(int j=0; j<=2; j++)
		{
			String value2 = mysheet1.getRow(0).getCell(j).getStringCellValue();
			System.out.print(value2+" ");
		}
		System.out.println();
		System.out.println("======row reading======");
		for(int i=0; i<=3; i++)
		{
			String value3 = mysheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value3+" ");
		}
		System.out.println("======excel reading======");
		for(int x=0; x<=3; x++)//row
		{
			for(int y=0;y<=2; y++)//cell
			{
				String value4 = mysheet1.getRow(x).getCell(y).getStringCellValue();
				System.out.print(value4+" ");
			}
			System.out.println();
		}
		System.out.println("===========================");
		
		//File myfile1=new File("C:\\Users\\chals\\OneDrive\\Desktop\\practise excel.xlsx");
		Sheet mysheet2 = WorkbookFactory.create(myfile).getSheet("Sheet2");
		for(int l=0; l<=3; l++)//row
		{
			for(int m=0;m<=4; m++)//cell
			{
				CellType value4 = mysheet2.getRow(l).getCell(m).getCellType();
				System.out.print(value4+" ");
			}
			System.out.println();
		}
	}

}
