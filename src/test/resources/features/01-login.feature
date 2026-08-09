Feature: Login Functionality
  As a registered user of SauceDemo
  I want to log in with my credentials
  So that I can access the products inventory

  Scenario: Successful login with valid credentials
    Given the user is on the SauceDemo login page
    When the user enters the username "standard_user" and password "secret_sauce"
    And the user clicks the login button
    Then the user should be redirected to the inventory page
