Feature: Workspace features-Drag-Drop & Multi-Select

  Background: Common Steps of all scenarios
    Given user is on home page
    And get the heading and print
    And user click on workspace link
    And get the heading and print
@All    
@DragAndDrop
  Scenario: Workspace drop feature
    Given select the drop element AUI-2 link
    And get the heading and print
    Then drag the dragable element to droping point
@All
@MultiSelect
  Scenario: Workspace multi-select feature
    Given select the multi-select title element click AUI-4
    Then get all the list element of list
    And select all the present list and print
    
