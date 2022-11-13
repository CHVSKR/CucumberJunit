package PageObjects;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ScreenShots;
import Utilities.WaitHelper;

public class CheckoutPage {
	public WebDriver driver;
	WaitHelper helper;
	ScreenShots screenShot;

	public CheckoutPage(WebDriver driver) {
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
	@FindBy(xpath = "//a[@class='increment']")
	@CacheLookup
	WebElement increment;
	@FindBy(xpath = "//button[text()='ADD TO CART']")
	@CacheLookup
	WebElement addCart;
	@FindBy(xpath = "//img[@alt='Cart']")
	@CacheLookup
	WebElement cartButton;
	@FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
	@CacheLookup
	WebElement checkoutButton;
	@FindBy(xpath = "//table[@id='productCartTables']/tbody/tr/td[2]")
	@CacheLookup
	WebElement tableData;
	@FindBy(xpath = "//button[@class='promoBtn']")
	@CacheLookup
	WebElement promoButton;
	@FindBy(xpath = "//button[text()='Place Order']")
	@CacheLookup
	WebElement orderButton;

	public void checkVegetable(String sname) {
		searchVegetable.clear();
		searchVegetable.sendKeys(sname);
		ScreenShots.captureScreenshot(driver, "checkVegetable");
	}

	public String checkProduct() {
		String text = product.getText();
		ScreenShots.captureScreenshot(driver, "checkProduct");
		return text;
	}

	public void itemClick(int quantity) {
		int i = quantity-1;
		while(i>0) {
			increment.click();
			i--;
		}
//		for (int i = 0; i < 3; i++) {
//			increment.click();
//		}
		addCart.click();
		ScreenShots.captureScreenshot(driver, "itemClick");
	}

	public void clickCheckOut() {
		cartButton.click();
		ScreenShots.captureScreenshot(driver, "itemClick");
	}
	public void proceedCheckout() {
		checkoutButton.click();
		ScreenShots.captureScreenshot(driver, "itemClick");
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for(String windowHandles : windows) {
			if(!windowHandles.equals(parentWindow)) {
				driver.switchTo().window(windowHandles);
			}
		}
	}
	public String getTableData() throws InterruptedException {
		Thread.sleep(2000);
		String colData = tableData.getText();
		ScreenShots.captureScreenshot(driver, "getTableData");
		return colData;
	}
	public Boolean promoButton() {
		return promoButton.isDisplayed();
	}
	public Boolean orderButton() {
		return orderButton.isDisplayed();		
	}
	
}
