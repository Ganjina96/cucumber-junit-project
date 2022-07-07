Feature: Google Search Functionality Title Verification

  User Story: As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information

  Background:
    Given user is on Google search page

  @smoke @googleSearch
  Scenario: Search functionality result title verification
    When user types apple in the google search box and clicks enter
    Then user sees apple - Google Search is in the google title


  Scenario: Search functionality result title verification
    When user types "apple" in the google search box and clicks enter
    Then user sees "apple - Google Search" is in the google title
