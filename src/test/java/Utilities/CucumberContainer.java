package Utilities;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;
import PageObjects.VegetablePage;
import StepDefinitions.VegetableTest;

public class CucumberContainer {
	public WebDriver driver;
	public Logger logger;
	public String expectedResult;
	public PageObjectManager pageom;
	public TestBase testBase;
	
	public CucumberContainer() throws IOException {
		logger = Logger.getLogger("nopcommerce");
		PropertyConfigurator.configure("log4j.properties");
		testBase = new TestBase();
		pageom = new PageObjectManager(testBase.WebDriverManager());
	}
}
