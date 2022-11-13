package StepDefinitions;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObjects.VegetablePage;

public class BaseClass {
	public WebDriver driver;
	public VegetablePage vp;
	public Logger logger;
	public Properties configprop;
	
	public static String randomeString() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
		
	}
}
