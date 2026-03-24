Feature: Login and Logout

  Scenario: Valid Login
    Given user is on login page
    When user enters valid credentials
    Then user should be logged in

  Scenario: Logout
    Given user is logged in
    When user clicks logout
    Then user should be logged out