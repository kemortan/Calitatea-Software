Feature: User can add products to cart
  Scenario: Verify if user can add products to cart
    Given User is on main page
    When User click on ADD TO CART button on multiple products
    Then Selected item is added to the shopping cart