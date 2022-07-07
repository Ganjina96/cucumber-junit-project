@wiki
Feature: Wikipedia Search Functionality

  Background:
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button


  Scenario: Wikipedia Search Functionality Title Verification
    Then User sees "Steve Jobs" is in the wiki title


    Scenario: Wikipedia Search Functionality Header Verification
      Then User sees "Steve Jobs" is in the main header


    Scenario: Wikipedia Search Functionality Image Header Verification
      Then User sees "Steve Jobs" is in the image header