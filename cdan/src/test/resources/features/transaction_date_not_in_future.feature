Feature: Transaction Date Validation
  As a user
  I want to ensure that the transaction date is not in the future

  Scenario: Validate Transaction Date
    Given I have parsed the XML document
    When I extract the transaction date
    Then the transaction date should not be in the future
