Feature: IBAN Validation
  As a user
  I want to ensure that all IBANs in the XML document are valid

  Scenario: Validate IBANs
    Given I have parsed the XML document
    When I extract all IBANs
    Then all IBANs should be valid
