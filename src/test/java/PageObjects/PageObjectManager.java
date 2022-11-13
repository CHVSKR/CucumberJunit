package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public VegetablePage vp;
	public CheckoutPage cp;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public VegetablePage getVegetablePage() {
		vp = new VegetablePage(driver);
		return vp;
	}
	
	public CheckoutPage getCheckoutPage() {
		cp = new CheckoutPage(driver);
		return cp;
	}
}
