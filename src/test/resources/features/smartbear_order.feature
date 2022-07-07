Feature: SmartBear order process

  Background:
    Given User is logged into SmartBear Tester account and on Order page

  Scenario:
    When User selects FamilyAlbum from product dropdown
    When User enters 4 to quantity
    And User enters "John Wick" to customer name
    When User enters "Kinzie Ave" to street
    And User enters "Chicago" to city
    When User enters "IL" to state
    And User enters "60056"
    When User selects Visa as card type
    And User enters "1111222233334444" to card number
    When User enters "12/22" to expiration date
    And User clicks process button
    Then User verifies "John Wick" is in the list


  Scenario Outline: SCENARIO OUTLINE PRACTICE
  When User selects "<product>" from product dropdown
  And User enters "<quantity>" to quantity
  When User enters "<customer name>" to customer name
  And User enters "<street>" to street
  When User enters "<city>" to city
  And User enters "<state>" to state
  When User enters "<zip>" to zip
  And User selects "<cardType>" as card type
  When User enters "<card number>" to card number
  And User enters "<expiration date>" to expiration date
  When User clicks process button
  Then User verifies "<expected name>" is in the list


    Examples:
      | product     | quantity | customer name   | street      | city        | state | zip   | cardType | card number   | expiration date | expected name   |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago     | IL    | 60004 | Visa     | 313313133315  | 12/22           | Ken Adams       |
      | FamilyAlbum | 4        | Joey Tribbiani  | State st    | Chicago     | IL    | 60656 | Visa     | 123433533336  | 11/22           | Joey Tribbiani  |
      | ScreenSaver | 5        | Rachel Green    | Michigan st | Chicago     | IL    | 60056 | Visa     | 335333333337  | 10/22           | Rachel Green    |
      | MyMoney     | 5        | Chandler Bing   | Erie st     | Chicago     | IL    | 60666 | Visa     | 4333353333338 | 10/22           | Chandler Bing   |
      | FamilyAlbum | 9        | Dr DrakeRamoray | Dale st     | Arl Hgths   | IL    | 60452 | Visa     | 5323333353334 | 10/22           | Dr DrakeRamoray |
      | ScreenSaver | 10       | Monica Geller   | Euclid ave  | Arl Hgths   | IL    | 60312 | Visa     | 733533333333  | 10/22           | Monica Geller   |
      | MyMoney     | 3        | Ross Geller     | River rd    | Des Plaines | IL    | 60666 | Visa     | 833435363732  | 10/22           | Ross Geller     |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago     | IL    | 60312 | Visa     | 933533333531  | 12/22           | Ken Adams       |
