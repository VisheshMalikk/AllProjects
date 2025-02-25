package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reportsConfig {
	ExtentReports extent;

	public static ExtentReports getReportObject() {

		// Two classes - ExtentReports, ExtentSparkReporter
		String reportPath = System.getProperty("user.dir") + "\\reports\\index.html";
		// Its a helper class to set some configs then finally it reports to main class that configs are done
		ExtentSparkReporter extentSpark = new ExtentSparkReporter(reportPath);
		extentSpark.config().setReportName("Web Automation Result");
		extentSpark.config().setDocumentTitle("Test Cases Results");
		// ExtentReports is our main class - it is responsible of our report execution
		ExtentReports extent = new ExtentReports();
		// The config we have set in Spark then attatch to Main class (ExtentReports)
		// Now our main class have the knowledge of extentSpark object
		extent.attachReporter(extentSpark);
		extent.setSystemInfo("Tester", "Vishesh Malik");
		return extent;
	}

}
