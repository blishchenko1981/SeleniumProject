Feature: Demonstrating the data table feature of cucumber

  Cucumber provide ability to organize reapiting step in different data and automaticly convert the table into few
  known data types supported by cucumber

  Scenario: Petting zoo

    Given I have 'horse'
    And  I have 'dog'
    And I have "turtle"
    And I have "zebra"
    When I call their names
    Then They come to me.

  Scenario: Petting zoo with table
    Given I have following animals
      | horse  |
      | dog    |
      | turtle |
      | zebra  |
    When I call their names
    Then They come to me.