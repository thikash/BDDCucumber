#Author: aathiprakash.1995@gmail.com
Feature: Search Mobile in filpKart webapplication
  Background:
  Given user close the login page in flipKart
    Scenario: Mobile purchase
    When user search the mobile
    And user select required mobile
    But user select payment method in UPI
    Then user got the confirmation
    
    Scenario: moible purchase one dimensional List
    When user search the mobile one dimensional list
    |"Motorola Mobile"|"Realme Mobile"|"Redmi Mobile"|
    And user select required mobile
    But user select payment method in UPI
    Then user got the confirmation
    
   Scenario: moible purchase two dimensional Map
    When user search the mobile two dimensional map
    |mob1|"Samsung mobile"|
    |mob2|"One Plus"|
    |mob3|"Poco mobile"|
    And user select required mobile
    But user select payment method in UPI
    Then user got the confirmation
   
  Scenario Outline: Mobile purchase
    When user search the mobile "<MOBILE>"
    And user select required mobile
    But user select payment method in UPI
    Then user got the confirmation

    Examples: 
  |MOBILE|
  |Iphone mobile|
  |Realme mobile|
  |Redmi mobile|
