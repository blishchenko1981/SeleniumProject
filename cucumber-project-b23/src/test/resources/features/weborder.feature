Feature: web order app login
   As a user
  I should be able to login to web order app

  Background:
    Given User on webOrder login page

  @ui
  Scenario: User are able to login successfully
    When user provide valid credentials
    Then user can navigate to the webOrder home page

  @ui
  Scenario: User are NOT able to login with wrong credentials
    When user provide invalid credentials
    Then login error message should be present

    @ui
    Scenario: User login with specific credentials
      When I provide username "Tester" and password "test"
      Then user can navigate to the webOrder home page

  @ui
  Scenario: User login with specific wrong credentials
    When I provide username "TesterWrongName" and password "testWrongPass"
    Then login error message should be present
