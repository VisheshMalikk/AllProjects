package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/featuresFiles/secondProgram.feature",
		dryRun = true, // It will give you the compile time warning if any step def is missing before execution any scenario
		glue = "stepDefinitionFiles",
		monochrome = true,
		tags = "@RegressionTest or @MobileTest or @SmokeTest", // Run all test cases/scenarios except regression
		plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cucumber.xml"}
		)

// What kind of reports cucumber generates?
// So the report generation is controlled from  the TestRunner file
// Pretty : your report will comes with color
// dryRun = true -- 
// 1) It helps identify unimplemented step definitions before running the tests
// 2) Saves time by skipping the actual execution of the scenarios
// 3) Useful during the initial setup of feature files and step definitions


//tags = "@RegressionTest"
//tags = "@SmokeTest"
//tags = "@RegressionTest and @SmokeTest"
//tags = "@RegressionTest or @SmokeTest"
//tags = "not @RegressionTest"
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
