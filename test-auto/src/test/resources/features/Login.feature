@Login
Feature: Login Functionally

  Scenario: Successful login
    Given I am on the home page
    And I click on Sign in link text
    When I enter valid username and password
    And I click on the login button
    Then I should be logged in successfully