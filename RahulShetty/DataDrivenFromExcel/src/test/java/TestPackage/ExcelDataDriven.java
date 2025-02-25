package TestPackage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {
	// 1) Identify Test Cases column by scanning the entire Ist row
	// 2) Once column is identified then scan entire test case column to identify purchase test case
	// 3) After you grab Purchase testcase row then pull all the data of that row  and fees into test
	public static void main(String[] args) throws IOException {

	}
	// Method to get data from excel sheet
	public List<String> getData(String TestCaseName) throws IOException {
		// File InputStream Argument
		// We have to pass the object which have access to read below file
		// FileInputStream class have power to read any file fis object has permission to read below file
		FileInputStream fis = new FileInputStream("C:\\Users\\Vishesh.1.Malik\\Downloads\\TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis); // object of class : XSSFWorkbook
		int sheets = workBook.getNumberOfSheets();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < sheets; i++) {
			if (workBook.getSheetName(i).equals("Data")) {
				XSSFSheet sheet = workBook.getSheetAt(i);
				// 1) Identify Test Cases column by scanning the entire Ist row
				Iterator<Row> rows = sheet.iterator(); // Sheet is collection of rows
				Row firstRow = rows.next();
				
				Iterator<Cell> cells = firstRow.cellIterator(); // Row is collection of cells
				int k = 0;
				int column = 0;
				while (cells.hasNext()) {
					Cell value = cells.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						column = k;
					}
					k++;
				}
				System.out.println("Column no of the TestCases column name : " + column);
				// 2) Once column is identified then scan entire test case column to identify purchase test case
				while (rows.hasNext()) {
					Row row = rows.next();
					if (row.getCell(column).getStringCellValue().equalsIgnoreCase(TestCaseName)) {
						// 3) After you grab Purchase testcase row then pull all the data of that row and fees into test
						Iterator<Cell> cv = row.cellIterator();
						while (cv.hasNext()) {
							Cell c = cv.next();
							if(c.getCellType() == CellType.STRING) {
								list.add(c.getStringCellValue());
							} else {
								list.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}
					}
				}
			}
		}
		System.out.println(list);
		workBook.close();
		return list;
	}

}
