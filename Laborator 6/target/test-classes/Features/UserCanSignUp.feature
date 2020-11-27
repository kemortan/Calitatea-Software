Feature: Register user

  Scenario Outline: User can Sing Up with valid credentials
    Given User is on main page
    And User clicks on 'Sign Up' link
    When User enters '<name>' in Name field
    And User enters '<email>' in Email field
    And User enters '<password>' in 'password' field
    And User enters '<confirmPassword>' in 'Confirm Password' field
    And User clicks on SignUp
    Then User is registered successfully

    Examples:
      | name               | email              | password | confirmPassword |
      | Cemortan Vladislav | kemortan@gmail.com | 123456   | 123456          |