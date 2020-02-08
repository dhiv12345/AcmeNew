package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnReadExcel {
	
	public String[][] readExcel(String fileName) throws IOException {
//		HSSFWorkbook
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int colCount = wsheet.getRow(0).getLastCellNum();
		int rowCount = wsheet.getLastRowNum();
		System.out.println("Row count "+rowCount);
		System.out.println("Col count "+colCount);
		String[][] data = new String[rowCount][colCount];
//		for all the rows
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = wsheet.getRow(i);
//			for all the columns of each row
			for (int j = 0; j<colCount; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j] = value;
				System.out.println(data[i-1][j]);
			}
//			System.out.println();
		}
		
		wbook.close();
		
		return data;
		
		
		
		
		
		
		
		
		
	}
	
}


