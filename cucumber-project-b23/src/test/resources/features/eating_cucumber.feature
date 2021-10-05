Feature: Eating too many cucumbers may not be good for you
  Eating too much of anything may not be good for you
  Scenario: Eating a few is no problem
    Given John is hungry 
    When He eats 3 cucumbers
    Then he will be full

  Scenario: Eating too many is problem
    Given Vitalii want to eat
    When  He eats 6 cucumbers
    Then He feel stuffed

