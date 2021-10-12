
@ui
Feature: Google Search

@wip
  Scenario: User search by keyword
    Given user is at home page
    When user search for keyword "selenium"
    Then we should see result page
    And the title should start with "selenium"

  @wip
  Scenario: User search by keyword java
    Given user is at home page
    When user search for keyword "java"
    And the title should start with "java"
