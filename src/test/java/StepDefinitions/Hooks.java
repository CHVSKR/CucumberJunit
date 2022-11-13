package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import PageObjects.PageObjectManager;
import Utilities.CucumberContainer;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;

public class Hooks {
	
	CucumberContainer cucumberContainer;
	public Hooks(CucumberContainer cucumberContainer) {
		this.cucumberContainer = cucumberContainer;
	}
	
	@After
	public void closeBrowser() throws IOException {
		cucumberContainer.logger.info("Closing Browser");
		cucumberContainer.testBase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void addScreenShot(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
		File src = ((TakesScreenshot)cucumberContainer.testBase.WebDriverManager()).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(src);
//		scenario.attach(fileContent,"image/png","image");
	}
	}
}
