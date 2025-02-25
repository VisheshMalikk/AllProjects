package DataProviderExcelIntegration;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {

	DataFormatter dataformatter = new DataFormatter();
	@DataProvider(name = "TD")
	public Object[][] getData() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Vishesh.1.Malik\\Downloads\\NNURegression.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int columnCount = row.getLastCellNum();

		Object data[][] = new Object[rowCount - 1][columnCount];

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = dataformatter.formatCellValue(cell);
			}
		}
		return data;
	}

}
