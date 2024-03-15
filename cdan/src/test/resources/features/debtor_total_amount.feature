Feature: Debtor Amount Validation
  As a user
  I want to ensure that the debtor's amount is equal to the sum of all credits

  Scenario: Validate Debtor Amount
    Given I have parsed the XML document
    When I calculate the sum of all credit amounts
    Then the debtor's amount should be equal to the sum of all credits
