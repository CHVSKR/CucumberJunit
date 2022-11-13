$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Checkout.feature");
formatter.feature({
  "name": "Test Checkout Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check the checkout Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome browser and URL is Entered",
  "keyword": "Given "
});
formatter.match({
  "location": "VegetableTest.user_Launch_Chrome_browser_and_URL_is_Entered()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User searches \"Cucumber\" then Cucumber should be displayed",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutTest.user_searches_then_Cucumber_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User Add \"3\" items and Click ADDTOCART Button",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutTest.user_Add_items_and_Click_ADDTOCART_Button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click on check button",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutTest.click_on_check_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click Proceed to checkout button",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutTest.click_Proceed_to_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Verfiy the Added item is displayed in checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutTest.verfiy_the_Added_item_is_displayed_in_checkout_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "check the Apply and proceed buttons are enabled",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutTest.check_the_Apply_and_proceed_buttons_are_enabled()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Test Vegetable Site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check the Vegetable availale",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome browser and URL is Entered",
  "keyword": "Given "
});
formatter.step({
  "name": "User searches \u003cName\u003e then Tomato should be displayed",
  "keyword": "When "
});
formatter.step({
  "name": "click on top deals link",
  "keyword": "And "
});
formatter.step({
  "name": "Page title should be \"GreenKart - veg and fruits kart\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters \u003cName\u003e in search field",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name"
      ]
    },
    {
      "cells": [
        "Toma"
      ]
    },
    {
      "cells": [
        "Pota"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check the Vegetable availale",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome browser and URL is Entered",
  "keyword": "Given "
});
formatter.match({
  "location": "VegetableTest.user_Launch_Chrome_browser_and_URL_is_Entered()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User searches Toma then Tomato should be displayed",
  "keyword": "When "
});
formatter.match({
  "location": "VegetableTest.user_searches_then_Tomato_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click on top deals link",
  "keyword": "And "
});
formatter.match({
  "location": "VegetableAssert.click_on_top_deals_link()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"GreenKart - veg and fruits kart\"",
  "keyword": "Then "
});
formatter.match({
  "location": "VegetableAssert.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user enters Toma in search field",
  "keyword": "When "
});
formatter.match({
  "location": "VegetableAssert.user_enters_in_search_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the Vegetable availale",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome browser and URL is Entered",
  "keyword": "Given "
});
formatter.match({
  "location": "VegetableTest.user_Launch_Chrome_browser_and_URL_is_Entered()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User searches Pota then Tomato should be displayed",
  "keyword": "When "
});
formatter.match({
  "location": "VegetableTest.user_searches_then_Tomato_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click on top deals link",
  "keyword": "And "
});
formatter.match({
  "location": "VegetableAssert.click_on_top_deals_link()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"GreenKart - veg and fruits kart\"",
  "keyword": "Then "
});
formatter.match({
  "location": "VegetableAssert.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user enters Pota in search field",
  "keyword": "When "
});
formatter.match({
  "location": "VegetableAssert.user_enters_in_search_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});