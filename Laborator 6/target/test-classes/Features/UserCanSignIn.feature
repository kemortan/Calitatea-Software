Feature: User can Sign In
  Scenario Outline: User can Sign In with valid credentials
    Given User is on main page
    And User clicks on 'Sign In' link
    When User enters '<name>' in 'Name' field
    And User enters '<email>' in 'Email' field
    And User clicks on SignIn
    Then User is logged in successfully

    Examples:
      | name            | email                     |
      | Cemortan Vladislav | kemortan@gmail.com|