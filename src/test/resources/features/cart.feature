Feature: Add to Cart Functionality
As a logged-in SauceDemo user,
I want to add products to my shopping cart,
So that I can purchase them later.

  Background:
    Given the user successfully login with valid credentials

  Scenario: User successfully adds a product to the shopping cart
    When the user clicks the "Add to cart" button for the Sauce Labs Backpack
    Then the button text for the item should change to "Remove"
    And the shopping cart badge should display "1"
    When the user clicks on the shopping cart icon
    Then the user should see the Sauce Labs Backpack on the Cart page
