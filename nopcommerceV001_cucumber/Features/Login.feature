#Author: Narayanan https://www.youtube.com/watch?v=d56lRIAwQEI
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
@tag
Feature: User Login
  

  @tag1
  Scenario: User Successful login to the admin demo page
	  Given User Launch Chrome Browser
	  When User opens URL "http://admin-demo.nopcommerce.com/login"
	  And User enters Email as "admin@yourstore.com" and password as "admin"
	  And Click on Login
	  Then Page Title should be "Dashboard / nopCommerce administration"
	  When User click on Log out link
	  Then Page Title should be "Your store. Login"
	  And close browser
	  


  @tag2
  Scenario Outline: Title of your scenario Datadriven
		Given User Launch Chrome Browser
	  When User opens URL "http://admin-demo.nopcommerce.com/login"
	  And User enters Email as "<email>" and password as "<password>"
	  And Click on Login
	  Then Page Title should be "Dashboard / nopCommerce administration"
	  When User click on Log out link
	  Then Page Title should be "Your store. Login"
	  And close browser

	  Examples:
	  		| email |	password |
	  		| admin@yourstore.com | admin |
	  		| admin1@yourstore.com | admin |
	  		
	  	