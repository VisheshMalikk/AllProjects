package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinitions",
		//dryRun = true, // It will give you the compile time warning if any step def is missing before execution any scenario
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
		)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
	
}
