package TestPackage;

import java.io.IOException;
import java.util.List;

public class classToGetTestDataFromUtilityClass {

	public static void main(String[] args) throws IOException {
		
		ExcelDataDriven dataDriven = new ExcelDataDriven();
		
		List<String> data = dataDriven.getData("Purchase");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));

	}

}
