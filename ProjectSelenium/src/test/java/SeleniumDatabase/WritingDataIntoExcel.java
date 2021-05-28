package SeleniumDatabase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {
	
public static void main(String[] args) throws IOException {
		
		File path = new File("F:\\myWork\\rjjo\\Writesheet.xlsx");
		
		FileInputStream fis = new FileInputStream(path);
		
		
		XSSFWorkbook xssf = new XSSFWorkbook(fis);
		
		XSSFSheet   sheet =	xssf.getSheet("EmpInfo");
		
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		
		Row row = sheet.getRow(0);
		  
		int colcount =  row.getLastCellNum();
		  System.out.println("columns "+colcount);
		
		  for(int i=0;i<=rowcount;++i)
		  {
			  for(int j=0;j<3;++j)
			  {
				  String data = sheet.getRow(i).getCell(j).getStringCellValue();
		         System.out.print(data+"           ");  
			  }
			  System.out.println();
		  
		  }
		  
	    sheet.getRow(0).createCell(3).setCellValue("password");
	
	  	FileOutputStream fos = new FileOutputStream(path);
	      
	  	xssf.write(fos);
	  	
	  	xssf.close();

	  	
    }
}
