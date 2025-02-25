package DataProviderExcelIntegration;

import java.io.IOException;
import org.testng.annotations.Test;

public class NNUTest {

	@Test(dataProvider = "TD", dataProviderClass = ExcelReader.class)
	public void createCase(String TestCaseName, String TestCaseDescription, String UserName, String Create) throws IOException {

		System.out.println(TestCaseName);
		System.out.println(TestCaseDescription);
		System.out.println(UserName);
		System.out.println(Create);
	}

}
