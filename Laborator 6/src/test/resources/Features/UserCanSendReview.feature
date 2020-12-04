Feature: Check review functionality
  Scenario Outline: Verify if user can add a review to a product
  Given Review page is opened
    And User open review tab
    When User enters '<name>' in Name
    And User enters '<email>' in Email
    And User enters '<message>' in Message
    When User clicks on Send
    Then Message is sent successfully

    Examples:
      | name               | email              | message         |
      | Cemortan Vladislav | kemortan@gmail.com | Generic Message |
