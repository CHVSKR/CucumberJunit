package PageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.CucumberContainer;
import Utilities.ScreenShots;
import Utilities.WaitHelper;

public class VegetablePage {
	public WebDriver driver;
	WaitHelper helper;
	ScreenShots screenShot;
	public String item;
	public String colData;
	
	public VegetablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		helper = new WaitHelper(driver);
		screenShot = new ScreenShots();
	}

	@FindBy(xpath = "//input[@placeholder='Search for Vegetables and Fruits']")
	@CacheLookup
	WebElement searchVegetable;
	@FindBy(xpath = "//h4[@class='product-name']")
	@CacheLookup
	WebElement product;
	@FindBy(xpath = "//a[text()='Top Deals']")
	@CacheLookup
	WebElement link;
	@FindBy(xpath = "//input[@id='search-field']")
	@CacheLookup
	WebElement search;
	@FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr/td[1]")
	@CacheLookup
	WebElement tableData;

	public void searchVegetable(String sname) {
		searchVegetable.clear();
		searchVegetable.sendKeys(sname);
		ScreenShots.captureScreenshot(driver, "searchVegetable");
	}

	public String searchProduct() {

		String text = product.getText();
		String[] prod = text.split("-");
		item = prod[0].trim();
		String price = prod[1].trim();
		ScreenShots.captureScreenshot(driver, "searchProduct");
		return item;
	}

public void links() {
	String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
	link.sendKeys(tab);
	ScreenShots.captureScreenshot(driver, "links");
	String parentWindow = driver.getWindowHandle();
	Set<String> windows = driver.getWindowHandles();
	for(String windowHandles : windows) {
		if(!windowHandles.equals(parentWindow)) {
			driver.switchTo().window(windowHandles);
		}
	}
}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void searchVegi(String searname) {
		search.clear();
		search.sendKeys(searname);
		ScreenShots.captureScreenshot(driver, "searchVegi");
		colData = tableData.getText();
	}
}
