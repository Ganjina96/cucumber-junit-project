Feature: Data Driven testing using Scenario Outline

  @outline
  Scenario Outline: Google capital cities search
    Given user is on Google search page
    When user searches for a "<country>" capital
    Then user should see "<capital>" in the result

    Examples:
      | country     | capital          |
      | AZERBAIJAN  | Baku             |
      | TAJIKISTAN  | Dushanbe         |
      | BULGARIA    | Sofia            |
      | UKRAINE     | Kyiv             |
      | AFGHANISTAN | Kabul            |
      | USA         | Washington, D.C. |
      | TURKEY      | Ankara           |