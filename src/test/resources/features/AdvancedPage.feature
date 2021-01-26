Feature: Filling out advanced search

  Background:
    Given User is on home page
  @fillInfo
  Scenario: User on Advance Page
    Given User clicks on Advanced Search button
    When User enters "30004" in zipcode text box
    And  User selects Certified Check box under Condition
    And User selects convertible check box under style
    And User selects from Year from dropdown menu From "2017"
    And User selects from Year to dropdown menu To "2020"
    And  User selects make as BMW from Make,Model and Trim section
    And User click on the search button
    Then User should be able to see only BMW cars on the page