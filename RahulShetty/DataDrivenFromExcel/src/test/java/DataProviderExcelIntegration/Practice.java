package DataProviderExcelIntegration;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice {

	public static void main(String[] args) throws IOException {
		getData();
	}

	public static void getData() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Vishesh.1.Malik\\Downloads\\NNURegression.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(fis);

		XSSFSheet sheet = book.getSheetAt(0);

		int totalRows = sheet.getPhysicalNumberOfRows();

		XSSFRow row = sheet.getRow(0);
		int totalCol = row.getLastCellNum();

		for (int i = 0; i < totalRows - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < totalCol; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.toString());
			}
		}

	}

}
