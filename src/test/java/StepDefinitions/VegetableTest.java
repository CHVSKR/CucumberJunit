package StepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.PageObjectManager;
import PageObjects.VegetablePage;
import Utilities.CucumberContainer;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class VegetableTest {
	CucumberContainer cucumberContainer;
	public PageObjectManager pageom;
	public VegetablePage vp;
	public VegetableTest(CucumberContainer cucumberContainer) {
		this.cucumberContainer = cucumberContainer;
		this.vp = cucumberContainer.pageom.getVegetablePage();
	}
//	@Before
//	public void setUp() throws IOException {
//		configprop = new Properties();
//		FileInputStream configpropfile = new FileInputStream("config.properties");
//		configprop.load(configpropfile);
//		cucumberContainer.logger = Logger.getLogger("nopcommerce");
//		PropertyConfigurator.configure("log4j.properties");
//		String br = configprop.getProperty("browser");
//		if (br.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", configprop.getProperty("chromepath"));
//			cucumberContainer.driver = new ChromeDriver();
//		}
//	}

	@Given("User Launch Chrome browser and URL is Entered")
	public void user_Launch_Chrome_browser_and_URL_is_Entered() {
		cucumberContainer.logger.info("Launching Browser");
		}

	@When("^User searches (.+) then Tomato should be displayed$")
	public void user_searches_then_Tomato_should_be_displayed(String string) {
		cucumberContainer.logger.info("Searching Product");
		vp.searchVegetable(string);
		cucumberContainer.expectedResult = vp.searchProduct();
	}

}
