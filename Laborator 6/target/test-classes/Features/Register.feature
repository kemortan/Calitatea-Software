Feature: Check register functionality
  Scenario Outline: Register with email and password
    Given Sign Up page of the shop is opened
    When User enter valid <name> <email> and <password>
    And Click on Sign Up button
    Then New user is created

    Examples:
      | name | email |  password |
      | Vladislav | kemortan@gmail.com | 123456 |