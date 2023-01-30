

Feature: Form features
  I want to use this template for my feature file
  Background: Common Steps of all scenarios
    Given user is on home page
    And get the heading and print
    And user click on workspace link
    And get the heading and print
@All
@Form
Scenario: Workspace forms feature
Given select the forms title element click all in one
Then enter first name
And enter last name
And enter email
And select country code india from dropdown
And enter phone number
And enter address line-1
And enter address line-2
And enter state
And enter postal-code
And select country india from dropdown
And select date of birth 2-2-1995 from datepicker
And Select gender male radio button
Then agree the T&C by clicking on checkbox
And click on sbmit button to submit the form




