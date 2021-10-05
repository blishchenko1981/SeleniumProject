Feature: Calculator feature
  As a user...
  Scenario: Add 2 number
    Given calculator app is open
    When I add 2 with 2
    Then I should get result 4 displayed

  Scenario: Add 2 number
    Given calculator app is open
    When I add 2 with 5
    Then I should get result 7 displayed
