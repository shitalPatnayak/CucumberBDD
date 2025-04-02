Feature: Login functionality test
@Regression @Sanity
  Scenario: Successful login with valid credentials
    Given User Launch Chrome browser
    When User opens url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin"
    And User enters email as "admin@yourstore.com" and password as "admin"
    And User clicks on Login
    Then Page title should be "nopCommerce demo store. Login"
    When User clicks on logout link
		Then Page title should be "nopCommerce demo store. Home page title"
		And close browser    
@Sanity
		Scenario Outline: Successful login with valid credentials as DatadrivenTesting 
		Given User Launch Chrome browser
    When User opens url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin"
    And User enters email as "<email>" and password as "<Password>"
    And User clicks on Login
    Then Page title should be "nopCommerce demo store. Login"
    When User clicks on logout link
		Then Page title should be "nopCommerce demo store. Home page title"
		And close browser 
		
Examples: 
|email|Password|
|admin123@gmail.com|Password@1|
|admin@gmail.com|Password|
|123@gmail.com|Pwd@1|
| | |
		
		
		
		
		
		
		
		
		
		
		