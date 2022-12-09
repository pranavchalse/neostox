package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DynamicWay {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("C:\\Users\\chals\\OneDrive\\Desktop\\practise excel.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		int lastRowNum = mysheet.getLastRowNum();
		int lastcell = mysheet.getRow(lastRowNum).getLastCellNum()-1;
		
		for(int i=0; i<=lastRowNum; i++)
		{
			for(int j=0; j<=lastcell; j++)
			{
				System.out.print(mysheet.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
