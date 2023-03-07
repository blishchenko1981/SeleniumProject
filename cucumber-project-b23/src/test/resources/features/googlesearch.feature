@ui
Feature:
  Search by keyword

  Background:
    Given user is at home page Google


  @wipGoogle
  Scenario: User search by keyword
    When user search for word "Ally"
    Then user should navigate result page
    And title should start with "Ally"

  @wipGoogle
  Scenario: User search by keyword
    When user search for word "Tata consultancy"
    Then user should navigate result page
    And title should start with "Tata consultancy"