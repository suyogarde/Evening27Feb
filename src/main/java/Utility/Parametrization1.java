package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization1 {
	public static String getData(String sheetName,int row, int cell) throws IOException {
		  FileInputStream file = new FileInputStream("G:\\automation\\Kite\\src\\test\\resources\\maven1.xlsx");
		  String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		  return value;
	}    

}

