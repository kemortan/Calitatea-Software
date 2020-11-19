Feature: Check detailed page of a product functionality
  Scenario: Verify if user can check full description of a product
    Given Product page is opened
    When User hover on a product
    And Click on Quick View button
    Then User is redirected to page with description of a product