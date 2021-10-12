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
    When I call their names with below names

      | Kire    |
      | Doru    |
      | Tito    |
      | Zemfira |

    Then They come to me with some noise

      | horse  | Nai  |
      | dog    | Woof |
      | turtle | Hiss |
      | zebra  | Bro  |

@ui
  Scenario: Login to weborder app by providing username pass in 2 column table

    Given we are at web order login page
    When we provide below credentials
      | username | Tester |
      | password | test   |

    Then we should see all order page


  Scenario: Representing table with header and more than 2 columns with list of map

    Given this is the product reference
      | Product     | Price | Discount |
      | MyMoney     | 100   | 0.08     |
      | FamilyAlbum | 20    | 0.15     |
      | ScreenSaver | 80    | 0.1      |




















