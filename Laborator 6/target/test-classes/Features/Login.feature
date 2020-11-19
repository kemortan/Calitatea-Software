Feature: Check login functionality
  Scenario Outline: Login with name and email
    Given Login page of the shop is opened
    When User enter <name> and <email>
    And Click on sign in button
    Then User is redirected to home page

    Examples:
    | name |  email |
    | Vladislav | kemortan@gmail.com |