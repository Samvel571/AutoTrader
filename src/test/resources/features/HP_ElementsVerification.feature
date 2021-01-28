Feature: Verify that  links: "Browse by Make, Browse by Style, Advance Search "
  Button:  Search
  Drop downs: Make, Model
  is Displayed


  @browseByMake
  Scenario: Verify Browse by Make link is displayed
    Given User is on home page
    Then User should be able to click on Browse by make button


  @browseByStyle
  Scenario: Verify Browse by style is displayed
    Given User is on home page
    Then User should be able to click on Browse by Style button

  @advanceSearch
  Scenario:
    Given User is on home page
    Then User should be able to click on Advance Search  button

  @search
  Scenario:
    Given User is on home page
    Then User should be able to click on Search  button

  @anyMakeDropdown
  Scenario:
    Given User is on home page
    Then User should be able to see Any Make dropdown

  @anyModelDropdown
  Scenario:
    Given User is on home page
    Then User should be able to see Any Model dropdown

  @clickAdvanced
  Scenario: Click on Advanced Search button
    Given User is on home page
    When User clicks on Advanced Search button
    Then User should be able to see Title contains Search
