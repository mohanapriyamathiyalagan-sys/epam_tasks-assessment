Feature: Registration

  Scenario: Register new user
    Given user is on registration page
    When user enters registration details
    Then account should be created