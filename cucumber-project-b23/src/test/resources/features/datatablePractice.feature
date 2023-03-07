Feature: Demonstrating the date table

  Cucumber provide ability to organize repeating steps with
  different data using the data table feature

  Scenario: User have zoo
    Given I have "horse"
    And I have "dog"
    And I have "turtle"
    And I have "zebra"
    When I call their names
    Then They come to me.

  Scenario: Petting zoo table format
    Given User have following animals.
      | horse  |
      | dog    |
      | turtle |
      | zebra  |
      | monkey |
    When I call their names with below

      | Mary   |
      | Rocky  |
      | Bill   |
      | Brrro  |
      | Banana |


    Then They come to me and make sound.

      | horse  | neihhh |
      | dog    | woof   |
      | turtle | hiss   |
      | zebra  | brrr   |
      | monkey | e-e-e  |