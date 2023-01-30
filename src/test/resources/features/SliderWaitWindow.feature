
Feature: Title of your feature
  I want to use this template for my feature file
  Background: Common Steps of all scenarios
    Given user is on home page
    And get the heading and print
    And user click on workspace link
    And get the heading and print
@All
@Slider
Scenario: Workspace slide feature
Given select the slide title element click AUI-5
Then get the initial value of Word limit slider
Then get the range of slider
Then slide the slider to 60%
Then click get countries button
Then get all the country names
@All
@Waits
Scenario: Workspace waits feature
Given select the wait title element click timeout
Then click on simple alert button
And wait for alert to present and get what time it took to apear
And get the text from alert
And accept the alert

@All
@Window
Scenario: Workspace window feature
Given select the window title element click tabs
And get the parent window name as string
And get the heading and print
Then click on open home page button
Then Click on the home button
Then Click on the Muiltiple windows button
Then Goto the newly opened tabs and get the titles
Then Print all the window title
Then Close all the windows
