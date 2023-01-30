#
#Sample Feature Definition Template
#URL:https://letcode.in/
#
Feature: Home page Features

  Background: 
    Given user is on home page
    And get the heading and print
@All
  @SignUp
  Scenario Outline: Sign Up to Letcode.in
    Given click on sign up button link
    And enter user name <UserName>
    And enter email <Address>
    And enter password <Password>
    And click on agree the t&c checkbox
    Then click on sign up button
    And get the heading and print
    Then click sign out

    Examples: 
      | UserName | Password     | Address     |
      | AryanRaj | Aryan1224@raj123 | aryan1224@raj.com |
@All
  @LogIn
  Scenario Outline: Verify Log in to website
    Given user clicks on loginLink button
    And enter email <Address>
    And enter password <Password>
    And click on login button
    And verify signed by signout button
    And get the heading and print
    Then click sign out

    Examples: 
      | Password     | Address     |
      | Aryan1224@raj123 | aryan1224@raj.com |
