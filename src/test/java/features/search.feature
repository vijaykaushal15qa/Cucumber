Feature: Search Functionality Validation

@SmokeTest
Scenario: Search and Validate
Given User is on Green Cart Landing Page
When User searched for Cucumber vegetable
Then "Cucumber" results are displayed 

@SanityTest
Scenario Outline: Search for item and move to checkout page
Given User is on Green Cart Landing Page
When User searched for <Name> vegetable
And Added items to cart
And User proceeded to checkout page
Then Verify selected <Name> items are displayed in checkout page

Examples:
|Name |
|Brinjal |
|Beetroot |