Feature: User can view details about any product
  Scenario: Verify if user can check full description of a product
    Given User is on main page
    And User clicks on 'Shop Now' link
    When User hover on a product
    And Click on Quick View button
    Then User is redirected to page with description of a product