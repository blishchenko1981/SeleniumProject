Feature: Weborder app should work as expected(Practice)

  Scenario: User should see all product from list
    Given we are at web order login page
    And we provide valid credentials
    When we select "Order" tab from sideBar
    Then we should see below options in Product dropdown list

      | MyMoney     |
      | FamilyAlbum |
      | ScreenSaver |


