#Author: your.email@your.domain.com https://www.youtube.com/watch?v=G5AW7gtHKY4
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regression
Feature: User add the customer in the site
  I want to use this template for my feature file

  @Addcustomer_TC
  Scenario: User add customer to database
    Given User Launch Chrome Browser
	  When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
	  And User enters Email as "admin@yourstore.com" and password as "admin"
	  And Click on Login
	  Then Page Title should be "Dashboard / nopCommerce administration"
	  And User click on Customers menu
	  And User click on Customers Submenu
	  And User click on Add new button
	  #When User enters customer info "<email>" "<password>" "<fname>" "<lname>" "<gender>" "<dob>" "<compname>" "<value>" "<value2>"
	  When User enters customers info
	  And User click on save button
	  Then Page should contain "The new customer has been added successfully."
	  When User click on Log out link
	  And close browser
	  
	  #Examples:
	  # 		| email |	password | fname | lname | gender | dob | compname | value | value2 |
	  #		| admin@yourstore.com | admin | ram | roy | male | 2/8/2000 | powerbull  |3 | Vendor 1 |
	  #		| admin1@yourstore.com | admin | sam | hit | female | 2/8/1989 | solarvibrant | 2 | 3 |
	  


 
