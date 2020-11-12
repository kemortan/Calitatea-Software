Feature: Check register functionality
  Scenario: Register with email and password
    Given Sign Up page of the shop is opened
    When User enter valid email and password
    And Click on Sign Up button
    Then New user is created