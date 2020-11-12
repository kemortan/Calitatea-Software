Feature: Check login functionality
  Scenario: Login with name and email
    Given Login page of the shop is opened
    When User enter name and email
    And Click on sign in button
    Then User is redirected to home page
