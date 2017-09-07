package utils;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataInputProvider {
	

	public Object[][] readExcel(String dataSheet) throws InvalidFormatException, IOException{
		
		File fis = new File("./data/"+dataSheet+".xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet  sheet = wb.getSheetAt(0);
		
		//RowCount
		int rowCount = sheet.getLastRowNum();
		//ColumnCount
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowCount][columnCount];
		
		
		System.out.println(rowCount);
		System.out.println(columnCount);
		
		for (int i = 1; i <= rowCount; i++) {			
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				data[i-1][j] = cell.getStringCellValue();
			}
		}
		return data;		
		
		
		
	}

}








