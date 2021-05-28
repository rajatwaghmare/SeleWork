package SeleniumDatabase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

	FileInputStream	fis = new FileInputStream("F:\\myWork\\rjjo\\writesheet.xlsx");
	
	XSSFWorkbook xssf = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = xssf.getSheet("EmpInfo");
		
	int rowcount = sheet.getLastRowNum();
	System.out.println(rowcount);
	
	Row row = sheet.getRow(0);
	
	int colcount = row.getLastCellNum();
	System.out.println("columns "+colcount);
	
	for(int i=0;i<=rowcount;i++) {
		for(int j=0;j<3;j++)
		{
			
			String data = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(data+"           ");
		
			/*String data = sheet.getRow(0).getCell(1).getStringCellValue();
			System.out.print(data+"           ");*/
				
		}
		System.out.println();
	}
	
  }

}
