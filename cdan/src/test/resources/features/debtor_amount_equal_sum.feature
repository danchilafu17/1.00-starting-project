Feature: Debtor Total Amount Validation
  As a user
  I want to ensure that the debtor's total amount has at least two digits

  Scenario: Validate Debtor Total Amount
    Given I have parsed the XML document
    When I extract the total amount of the debtor
    Then the total amount should have at least 2 digits
