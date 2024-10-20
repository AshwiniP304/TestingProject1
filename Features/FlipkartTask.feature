Feature: Flipkart search and add to cart

  Scenario Outline: Verify Flipkart Search by adding products in cart.
    Given launch Chrome Browser And Navigate to https://www.flipkart.com/
    When search the "<product>" in Flipkart
    Then add Product to Cart
    And I verify the product "<Title>" in step

    Examples: 
      | product | Title                       |
      | watch   | Shopping Cart  Flipkart.com |
      | shoes   | Shopping Cart  Flipkart.com |
      | goPro   | Shopping Cart  Flipkart.com |
      | phone   | Shopping Cart  Flipkart.com |
