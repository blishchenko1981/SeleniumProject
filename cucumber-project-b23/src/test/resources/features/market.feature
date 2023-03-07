Feature: Getting job

  As a student I should be able to got a second job

  Scenario: I prepare for a job
    Given I already have first job
    When Current project ends
    Then I should be able to get second project

    Scenario: I prepare for new project
      Given I already have first job
      When I learn and review 3 automation tools
      Then I should be able to get second project
