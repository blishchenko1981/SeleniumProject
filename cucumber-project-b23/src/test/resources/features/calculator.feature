## this below line is how we add tag to a feature at feature level
@calculator @non_ui
Feature: Calculator feature
  As a user...
  ## this below line is how we add tag to a feature at Scenario level
  @addition

  Scenario: Add 2 number
    Given calculator app is open
    When I add 2 with 2
    Then I should get result 4 displayed

  @smoke
  Scenario: Add 2 number
    Given calculator app is open
    When I add 2 with 5
    Then I should get result 7 displayed
