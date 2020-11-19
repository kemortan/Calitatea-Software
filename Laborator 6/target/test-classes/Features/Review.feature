Feature: Check review functionality
  Scenario: Verify if user can add a review to a selected product
    Given Page with reviews is opened
    When User enter valid name email and message
    And Click on Send Review button
    Then User is redirected to page with reviews