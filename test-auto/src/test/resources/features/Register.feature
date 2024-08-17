@Register
Feature: Register New User

  Scenario Outline: Successful login
    Given I am on the home page
    And I click on Register link text
    When I inserts user data from "<SheetName>" and rowNumber "<RowNumber>"
    And I click on the Register button
    Then user record is registered successfully

    Examples:
      | SheetName | RowNumber |
      | Users     | 1         |


