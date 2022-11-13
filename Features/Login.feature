Feature: Test Vegetable Site

@smoke
Scenario Outline: Check the Vegetable availale
    Given User Launch Chrome browser and URL is Entered
    When User searches <Name> then Tomato should be displayed
    And click on top deals link
    Then Page title should be "GreenKart - veg and fruits kart"
    When user enters <Name> in search field
    
Examples:
     | Name |
     | Toma |
     | Pota |