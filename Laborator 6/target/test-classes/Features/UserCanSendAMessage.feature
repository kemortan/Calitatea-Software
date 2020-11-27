Feature: Send Message to shop

  Scenario Outline: User can send a message using Contact Form
    Given User is on main page
    And User clicks on 'Contact' link
    When User enters '<name>' in Name-field
    And User enters '<email>' in Email-field
    And User enters '<subject>' in 'Subject' field
    And User enters '<message>' in 'Message' field
    And User clicks on Send button
    Then Message is sent successfully

    Examples:
      | name               | email              | subject         | message         |
      | Cemortan Vladislav | kemortan@gmail.com | Generic Subject | Generic Message |