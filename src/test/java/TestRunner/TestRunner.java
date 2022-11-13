package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {".//Features/Login.feature",".//Features/Checkout.feature"},
			glue = "StepDefinitions", 
			dryRun = false, 
			monochrome = true, 
			plugin = {"pretty", "html:test-output","rerun:target/failed_scenarios.txt"},
			tags = {"@smoke"}
			)
public class TestRunner {
	
}

//,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
