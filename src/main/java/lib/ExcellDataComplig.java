package lib;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellDataComplig {
	XSSFWorkbook wb;
	XSSFSheet s;
	public ExcellDataComplig(String excellPath) {
		
		
		try {
			File scr = new File(excellPath);
			FileInputStream input = new FileInputStream(scr);
			wb = new XSSFWorkbook(input);
			
		} catch (Exception e) {
			
			System.out.println( e.getMessage());
		}
		
	}
	
	public String getData(String sheetName, int rowValuve, int cellValue) {
		s = wb.getSheet(sheetName);
		String data = s.getRow(rowValuve).getCell(cellValue).getStringCellValue();
		
		
		return data;
	}
	
	public double intGetData (String sheetName, int rowValue, int cellValue) {
		
		double intData = s.getRow(rowValue).getCell(cellValue).getNumericCellValue();
		
		return intData;
	}

}
