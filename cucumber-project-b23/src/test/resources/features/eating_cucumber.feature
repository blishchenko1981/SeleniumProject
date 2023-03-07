Feature: Eating too many cucumbers may not be good for you
  Eating too much of anything may not be good for you

  Scenario: Eating a few is no problem
    Given 'John' is hungry
    When He eats 3 cucumbers
    Then he will be full

  Scenario: Eating too many is problem
    Given Vitalii want to eat
    When  He eats 6 cucumbers
    Then He feel stuffed


  Scenario: Eating not enough cause a headache
    Given "Mark" is hungry
    When He eats 1 cucumbers
    Then "Mark" is hungry again

  Scenario: People should not eat junk food
    Given "Bill" ate "chips" and "burger"
    When "Bill" went to home
    Then "Bill" had stomachache

  Scenario: People should eat healthy food
    Given "Mathew" ate "fruit" and "fish"
    When "Mathew" went to home
    Then He feel stuffed

    Scenario: People better should eat helthy food, but not too much
      Given "Jim" ate "bread" and "steak"
      When He eats 1 cucumbers
      When  He eats 6 cucumbers
      When "Jim" went to home
      Then "Jim" had stomachache

