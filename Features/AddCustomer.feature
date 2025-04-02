Feature: Customer add

Background: steps common for all scenarios- It will run automatically for all the scenarios
    Given User Launch Chrome browser
    When User opens url "https://demo.nopcommerce.com/login?returnUrl=%2Flogin"
    And User enters email as "admin@yourstore.com" and password as "admin"
    And User clicks on Login
    Then User can view dashboard
    When User clicks on Customer Menu
    And click on customer menu item
    
@Sanity  
Scenario: Add new customer

    And click on add new button
    Then User can view Add new customer page
    When User enter customer info
    And click on save button
		Then user can view confirmation message "The new customer has been added successfully"
		And close browser
@Regression
Scenario: Search customer by email address

    And enter custometr email
    When click on search button
    Then User should found email in the search table
    And Close browser
    
Scenario: Search customer by First Name

    And enter custometr Firstname
    When click on search button
    Then User should found firstname in the search table
    And Close browser