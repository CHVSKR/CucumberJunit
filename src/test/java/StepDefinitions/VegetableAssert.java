package StepDefinitions;

import java.io.IOException;

import PageObjects.PageObjectManager;
import PageObjects.VegetablePage;
import Utilities.CucumberContainer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class VegetableAssert{
	CucumberContainer cucumberContainer;
	public PageObjectManager pageom;
	public VegetablePage vp;
	public VegetableAssert(CucumberContainer cucumberContainer) {
		this.cucumberContainer = cucumberContainer;
		this.vp = cucumberContainer.pageom.getVegetablePage();
	}
	@When("click on top deals link")
	public void click_on_top_deals_link() {
		VegetablePage vp = cucumberContainer.pageom.getVegetablePage();
//		vp = new VegetablePage(cucumberContainer.driver);
		cucumberContainer.logger.info("Click on Link");
		vp.links();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
		VegetablePage vp = cucumberContainer.pageom.getVegetablePage();
		cucumberContainer.logger.info("Verifying Title");
		Assert.assertEquals(string,vp.getPageTitle());
	}

	@When("^user enters (.+) in search field$")
	public void user_enters_in_search_field(String string) {
		VegetablePage vp = cucumberContainer.pageom.getVegetablePage();
		cucumberContainer.logger.info("Searching Product");
		vp.searchVegi(string);
		cucumberContainer.logger.info("Asserting Product");
		Assert.assertEquals(cucumberContainer.expectedResult, vp.colData);
	}

//	@Then("close browser")
//	public void close_browser() throws IOException {
//		cucumberContainer.logger.info("Closing Browser");
//		cucumberContainer.testBase.WebDriverManager().quit();
//	}
	
}
