package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void readExcel() throws InvalidFormatException, IOException{

		//Load the File location
		File fis = new File("./data/CreateLead.xlsx");		
		//FileInputStream fio =  new FileInputStream(fis);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		//Enter to the Sheet
		XSSFSheet  sheet = wb.getSheetAt(0);

		//RowCount
		int rowCount = sheet.getLastRowNum();
		//ColumnCount
		int columnCount = sheet.getRow(0).getLastCellNum();

		//Print the Row Count and Column Count		
		System.out.println(rowCount);
		System.out.println(columnCount);

		//for Rows
		for (int i = 1; i <= rowCount; i++) {			
			XSSFRow row = sheet.getRow(i);

			//for Columns 
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				//Read the contact value (Note:: Only String)
				System.out.println(cell.getStringCellValue());
			}
		}
	}
}








