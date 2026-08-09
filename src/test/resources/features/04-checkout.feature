Feature: Checkout Functionality
As a user with items in my cart,
I want to complete the checkout process,
So that I can finalize my purchase.

  Background:
    Given the user successfully login with valid credentials
    And the user clicks the "Add to cart" button for the Sauce Labs Backpack
    And the user clicks on the shopping cart icon

  Scenario: User successfully completes the checkout process
    Given the user clicks the Checkout button
    When the user fills out the "Checkout: Your Information" form with "QA", "Tester", and "00000"
    And the user clicks the Continue button
    Then the user should be navigated to the Overview page to see the total price
    When the user clicks the Finish button
    Then the user should see the "Thank you for your order!" message
