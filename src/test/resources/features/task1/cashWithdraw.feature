Feature: Withdraw cash from account

  Scenario: Withdraw cash from account in credit
    Given I have a balance of 100 in my account
    When I request 20
    Then 20 should be dispensed