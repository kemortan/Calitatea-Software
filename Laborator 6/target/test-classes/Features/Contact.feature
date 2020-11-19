Feature: Check contacting shop functionality
  Scenario: Contact the shop with valid data
    Given Contact page of the shop is opened
    When User enter valid name and email
    And Click on Send button
    Then The message should be sent to the shop