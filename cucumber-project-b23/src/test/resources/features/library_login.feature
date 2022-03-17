@ui @libraryLogin
Feature: Logging into Library app
  As a user
  I should be able to login to library app

  Scenario Outline: Login with valid credentials

    Given user is at library login page
    When user use username "<email>" and passcode "<password>"
    Then user should be at dashboard page
    Examples:
      | email               | password  |
      | student42@librarys   | Sdet2022* |
      | student43@library   | Sdet2022* |
      | student44@library   | Sdet2022* |
      | librarian54@library | Sdet2022* |
      | librarian15@library | Sdet2022* |