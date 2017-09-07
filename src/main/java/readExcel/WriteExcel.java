package readExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {

	@Test
	public void writeExcel() throws IOException{
		
		XSSFWorkbook wb =new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet();
		
		XSSFRow row = sheet.createRow(0);
		
		XSSFCell  cell = row.createCell(0);
		
		
		cell.setCellValue("TestLeaf");	
		
		
		File fis = new File("./data/result.xlsx");
		
		
		FileOutputStream fos = new FileOutputStream(fis);
		
		wb.write(fos);
		
		wb.close();
		
		
		
		
		
		
	}
	
	
}
