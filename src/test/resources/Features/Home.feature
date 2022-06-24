@home
Feature: Retail Test Environment


  @login
  Scenario: login to Test Environment
    Given User is on retail Website    
    When User click on myAccount
    And User click on Login option
    And User enter userName "cali.titans@tekschool.us" and password "cali123"
    And User click on login button
    Then User should be logged into myAccount page


    
   
    @threeinOne
    Scenario Outline: login with multipul users
    Given User is on retail Website    
    When User click on myAccount
    And User click on Login option
    And User enter userName "<userName>" and password "<password>"
    And User click on login button
    Then User should be logged into myAccount page
   
   Examples:
    |userName|password|
    |cali.titans@tekschool.us|cali123|
    |test.test@yahoo.com|123456|
    |test.test@gmail.com|123456|
    
    
