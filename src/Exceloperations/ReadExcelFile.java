package Exceloperations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	static String filePath = "C:\\Users\\sivasankar.seenivasa\\Desktop\\TestFile.xlsx";
	static FileInputStream readFile;
	static XSSFRow rows;

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws Exception {

		// Loaded File
		File loadFile = new File(filePath);

		if (loadFile.exists()) {
			System.out.println("File is exists.!");
			// read the File
			readFile = new FileInputStream(loadFile);
		}

		XSSFWorkbook workBook = new XSSFWorkbook(readFile);
		XSSFSheet sheet = workBook.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum() + 1;
		System.out.println("Row Count : " + rowCount);

		rows = sheet.getRow(0);
		int colsCount = rows.getLastCellNum();
		System.out.println("col Count : " + colsCount);

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colsCount; j++) {
				Cell cells = sheet.getRow(i).getCell(j);
				DataFormatter format = new DataFormatter();
				String cellValses = format.formatCellValue(cells);
				System.out.println(cellValses);
			}
		}
	}
}
// ok va ? ext numeber -- NINE SIX SEVEN -- wait i will sho