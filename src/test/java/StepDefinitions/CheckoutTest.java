package StepDefinitions;

import PageObjects.CheckoutPage;
import PageObjects.PageObjectManager;
import PageObjects.VegetablePage;
import Utilities.CucumberContainer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CheckoutTest {

	CucumberContainer cucumberContainer;
	public PageObjectManager pageom;
	public String item;
	public CheckoutPage cp;

	public CheckoutTest(CucumberContainer cucumberContainer) {
		this.cucumberContainer = cucumberContainer;
		this.cp = cucumberContainer.pageom.getCheckoutPage();
	}

	@When("User searches {string} then Cucumber should be displayed")
	public void user_searches_then_Cucumber_should_be_displayed(String string) {
		cucumberContainer.logger.info("Search item");
		cp.checkVegetable(string);
		item = cp.checkProduct();
	}

	@When("User Add {string} items and Click ADDTOCART Button")
	public void user_Add_items_and_Click_ADDTOCART_Button(String string) {
		cucumberContainer.logger.info("Add item to cart");
		cp.itemClick(Integer.parseInt(string));
	}

	@Then("click on check button")
	public void click_on_check_button() {
		cucumberContainer.logger.info("click checkout button");
		cp.clickCheckOut();
	}

	@Then("click Proceed to checkout button")
	public void click_Proceed_to_checkout_button() {
		cucumberContainer.logger.info("proceed to checkout");
		cp.proceedCheckout();
	}

	@Then("Verfiy the Added item is displayed in checkout page")
	public void verfiy_the_Added_item_is_displayed_in_checkout_page() throws InterruptedException {
		cucumberContainer.logger.info("Verify Added Item");
		String item1 = cp.getTableData();
		System.out.println(item);
		System.out.println(item1);
		Assert.assertEquals(item, item1);
	}

	@Then("check the Apply and proceed buttons are enabled")
	public void check_the_Apply_and_proceed_buttons_are_enabled() {
		cucumberContainer.logger.info("chek buttons");
		Assert.assertTrue(cp.promoButton());
		Assert.assertTrue(cp.orderButton());
	}

}
