Feature: Test Checkout Page

@smoke
Scenario: Check the checkout Page
    Given User Launch Chrome browser and URL is Entered
    When User searches "Cucumber" then Cucumber should be displayed
    And User Add "3" items and Click ADDTOCART Button
    Then click on check button
    And click Proceed to checkout button
    And Verfiy the Added item is displayed in checkout page
    And check the Apply and proceed buttons are enabled
    
    
    