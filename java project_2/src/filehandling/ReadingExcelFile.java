package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) {
		File file = new File("resources/EmployeeInfo.xlsx");
		InputStream is = null;
		try {
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Workbook book=null;
		try {
			book = new XSSFWorkbook(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Sheet sheet  = book.getSheet("details");
		/*Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		System.out.println(cell.getNumericCellValue());*/
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		for(int i = 0;i<rowCount;i++){
			Row currRow = sheet.getRow(i);
			for(int j=0;j<currRow.getLastCellNum();j++){
				Cell currCell = currRow.getCell(j);
				
				switch(currCell.getCellType()){
				case Cell.CELL_TYPE_STRING:
					System.out.print(currCell.getStringCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.print(currCell.getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(currCell.getNumericCellValue());
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
