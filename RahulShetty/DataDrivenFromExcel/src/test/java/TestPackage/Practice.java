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

public class Practice {

	public static void main(String[] args) throws IOException {
		// public static void excelReader() throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Vishesh.1.Malik\\Downloads\\TestData.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		int sheets = book.getNumberOfSheets();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < sheets; i++) {
			if (book.getSheetName(i).equals("Data")) {
				XSSFSheet sheet = book.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();

				Iterator<Cell> cells = firstRow.cellIterator();
				int k = 0;
				int column = 0;
				while (cells.hasNext()) {
					Cell value = cells.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						column = k;
					}
					k++;
				}
				System.out.println("Column number of the TestCase coulmn name : " + column);

				while (rows.hasNext()) {
					Row row = rows.next();
					if (row.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase")) {
						Iterator<Cell> cv = row.cellIterator();
						while (cv.hasNext()) {
							Cell c = cv.next();
							list.add(c.getStringCellValue());
						}
					}
				}
			}
		}
		System.out.println(list);
	}
}
