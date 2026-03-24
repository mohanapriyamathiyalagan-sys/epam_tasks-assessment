Feature: User Registration

  Scenario: Register new user
    Given user is on signup page
    When user enters name and email
    And user fills account details
    Then account should be created