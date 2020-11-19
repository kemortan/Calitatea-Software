Feature: Check cart functionality
  Scenario: Verify if user can add products to cart
    Given Page with products is opened
    When User click on add to cart button
    Then Selected item is added to the shopping cart