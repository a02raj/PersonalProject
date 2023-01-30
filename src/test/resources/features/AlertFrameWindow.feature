Feature: Workspace features-Alert,Frame,Window

  Background: Common Steps of all scenarios
    Given user is on home page
    And get the heading and print
    And user click on workspace link
    And get the heading and print

  @All @Alert
  Scenario: Workspace alert feature
    Given select the alert title element click dialog
    Then click on simple alert button
    And Accept the Alert
    Then click on confirm alert button
    And Dismiss the Alert & print the alert text
    Then click on prompt alert button
    And Type your name & accept
      | Aryan Raj |
    And verify the output
    Then click modern alert button
    And Dismiss the Alert & print the alert text

  @All @Frame
  Scenario Outline: Workspace frame feature
    Given select the frame title element click inner HTML
    Then get the number of frmes on the page
    And switch to outer frame by <name>
    Then enter first name and last name
      | first | last |
      | Aryan | Raj  |
    And get the output
    Then switch to inner frame by <webelement>
    And enter the <email> inside email field inside frame
    Then get back to main wndow page
    And get back to home page
    Examples:

      | name    | webelement | email        |
      | firstFr | element    | abcd@pqr.xyz |
