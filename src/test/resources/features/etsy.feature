Feature: Etsy page titles

  Background:
    Given User is on Etsy homepage


  Scenario:  Etsy Title Verification
    Then User sees title "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"


  Scenario: Etsy Search Functionality Title Verification
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title


    Scenario: Etsy Search Functionality Title Verification
      When User types "Wooden Spoon" in the search box
      And User clicks search button
      Then User sees "Wooden spoon" is in the title