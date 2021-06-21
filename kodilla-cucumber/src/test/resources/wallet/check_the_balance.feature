Feature: Check the balance
  Scenario: Checking the balance of the wallet
    Given I have deposited $200 in my wallet
    When I check the balance of my wallet
    Then It should be shown that the balance is $200