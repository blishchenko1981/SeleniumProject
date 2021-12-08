Feature: User login to the app
  As a user I should be able to login

  Scenario: User should be able to login

    Given I am at sauce demo login page
    When I provide correct credentials for "standard" user
    Then I should see the product page

