package practiseProjects;
import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Tp10excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\chals\\OneDrive\\Desktop\\practise excel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		int row = mysheet.getLastRowNum();
		int lastcell = mysheet.getRow(row).getLastCellNum()-1;
		for(int i=0; i<=row; i++)
		{
			for(int j=0; j<=lastcell; j++)
			{	System.out.print(mysheet.getRow(i).getCell(j).getCellType()+" ");	}
			System.out.println();
		}	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		for(int x=0; x<=row;x++)
		{ for(int y=0; y<=lastcell; y++)
			{	Cell data = mysheet.getRow(x).getCell(y);
				CellType datatype = data.getCellType();
				if(datatype==CellType.STRING)
				{	System.out.print(data.getStringCellValue()+" ");	}
				else if(datatype==CellType.NUMERIC)
				{	System.out.print(data.getNumericCellValue()+" ");	}
				else if(datatype==CellType.BOOLEAN)
				{	System.out.print(data.getBooleanCellValue()+" ");	}
				else if(datatype==CellType.BLANK)
				{	System.out.print(data.getStringCellValue()+" ");	}
			}
			System.out.println();
		}
	}
}
