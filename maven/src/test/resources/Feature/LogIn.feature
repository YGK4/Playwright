
Feature: Login
  Scenario: LogIn to the account
    Given 	user is on the login page
     And user enters valid credentials
    When user should be redirected to the homepage
   
