Feature: Logout Functionality
As a logged-in user,
I want to log out of the application via the hamburger menu,
So that my session is securely closed

  Scenario: Successful logout via the hamburger menu
    Given the user successfully login with valid credentials
    And I am a logged-in user on the inventory page
    When I click on the hamburger menu
    And I click on the Logout option
    Then the user should be redirected back to the login page
