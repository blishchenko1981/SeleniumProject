@calculator @non_ui
Feature: Calculator feature
  As a user,
  I should be able to use the calculator,
  so that I can do arithmetic operations.

  @wip2
  Scenario Outline: Add 2 number multiple example
    Given calculator app is open
    When I add <num1> with <num2>
    Then I should get result <expectedResult> displayed
    Examples:
      | num1 | num2 | expectedResult |
      | 3    | 5    | 8              |
      | 3    | 6    | 9              |
      | 2    | 55   | 57             |
      | 13   | 3    | 16             |
      | 31   | 1    | 21             |
      | 41   | 55   | 96             |

  ## below line is how we add tag to a feature at scenario level
#  Scenario: Add 2 numbers ex1
#    Given calculator app is open
#    When I add 2 with 2
#    Then I should get result 4 displayed
#
#  Scenario: Add 2 numbers ex2
#    Given calculator app is open
#    When I add 3 with 2
#    Then I should get result 5 displayed
#
#  Scenario: Add 2 numbers ex3
#    Given calculator app is open
#    When I add 21 with 20
#    Then I should get result 41 displayed