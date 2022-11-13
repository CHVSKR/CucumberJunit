package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;
	public Properties configprop;
	public Logger logger;

	public WebDriver WebDriverManager() throws IOException {
		if(driver == null) {
		configprop = new Properties();
		FileInputStream configpropfile = new FileInputStream("config.properties");
		configprop.load(configpropfile);
		logger = Logger.getLogger("nopcommerce");
		PropertyConfigurator.configure("log4j.properties");
		String br = configprop.getProperty("browser");
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", configprop.getProperty("chromepath"));
			driver = new ChromeDriver();
		}
		driver.get(configprop.getProperty("URL"));
		driver.manage().window().maximize();
		}
		return driver;
			}
}
