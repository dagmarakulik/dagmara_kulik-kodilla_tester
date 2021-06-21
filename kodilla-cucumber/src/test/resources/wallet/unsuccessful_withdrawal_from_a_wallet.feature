Feature: Unsuccessful withdrawal money from a wallet due to out of money
  Scenario: User tries to take out from a wallet more money than user has
    Given I have deposited $200 in my wallet
    When I withdraw $300
    Then Nothing should be dispensed
    And I should be told that I don't have enough money in my wallet