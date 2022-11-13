package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"@target/failed_scenarios.txt"},
			glue = "StepDefinitions", 
			dryRun = false, 
			monochrome = true, 
			plugin = {"pretty", "html:test-output","rerun:target/failed_scenarios.txt"},
			tags = {"@smoke"}
			)
public class FailedTestRunner {
	
}

//,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
