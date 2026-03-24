Feature: Login functionality

  Scenario: Valid login
    Given user is on login page
    When user enters valid email and password
    Then user should be logged in

  Scenario: Invalid login
    Given user is on login page
    When user enters invalid email and password
    Then error message should be displayed