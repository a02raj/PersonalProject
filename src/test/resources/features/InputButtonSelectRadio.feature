Feature: Workspace features-Input,button,Select and Radio
#
Background: Common Steps of all scenarios
    Given user is on home page
    And get the heading and print
    And user click on workspace link
    And get the heading and print
@All
@input
 Scenario Outline: Work space input features
    Given select the input element edit link
    And get the heading and print
    And enter full <name>
    And enter the text inside append <text>
    And get the text inside the text box
    And clear the text from clear the text
    And confirm edit field is disabled
    And confirm text is read only
    Examples:
      | name | text |
  |Aryan Raj| new word|
@All
  @Button
  Scenario: Workspace Button feature
    Given select the button title element click
    And click on goto home and navigate back to current page
    And get the x and y co-ordinates of the button
    And Find the color of the button
    And Find the height & width of the button
    And Confirm button is disabled
    And Click and Hold Button and get the button output
@All
  @DropDown
  Scenario Outline: Workspace dropdown feature
    Given select the Select title element link drop-down
    And Select the <fruit> using visible text and print the output
    And Select your super <heros> and prints the output
    And Select the programming <language> and print all the options
    And Select <country> using value & print the selected value
    Examples:
    |fruit|heros|language|country|
    |2    |dd   |swift               |India  |
@All
  @Radio
  Scenario: Workspace radio feature
    Given select the radio title element click toggle
    And select any one from yes or no
    And Cofirm you can select only one radio button
    And Find the bug
    And Find which one is selected
    And Confirm last field is disabled
    And Find if the checkbox is selected?
    Then Accept the T&C
