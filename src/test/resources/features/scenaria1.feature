@wip
Feature: Adding a movie to wishList successfully

  Background:
    Given the user navigates to login page
  @positiveSignUp
  Scenario: SignUp as a new user successfully
    When  the user clicks register button
    And  the user registers successfully with valid credentials
      | email    | antoinejose75@gmail.com |
      | password | antoine27               |
    Then the user should be on the main page with username "antoinejose75"

  @negativeSignUp
  Scenario: The user cannot signup with invalid credentials
    When  the user clicks register button
    And  the user registers successfully with valid credentials
      | email    | antoinejose75gmail.com |
      | password | antoine27              |
    Then the warning message is displayed


  @login
  Scenario: Login as a registered user successfully
    Given the user clicks the login button
    When  the user logins successfully with valid credentials
      | email    | antoinejose75@gmail.com |
      | password | antoine27               |
    And the user should see the notification button as a verification

  @search
  Scenario: Login as a registered user successfully
    Given the user clicks the login button
    When  the user logins successfully with valid credentials
      | email    | antoinejose75@gmail.com |
      | password | antoine27               |
    And the user should see the notification button as a verification
    And the user searches the movie "Viking" on the search button
    When the user clicks the result
    Then the movie "Viking" is displayed on the content page


  @addtoWislist
  Scenario: Login as a registered user successfully
    Given the user clicks the login button
    When  the user logins successfully with valid credentials
      | email    | antoinejose75@gmail.com |
      | password | antoine27               |
    And the user should see the notification button as a verification
    And the user searches the movie "Onward" on the search button
    And the user clicks the result
    And the user clicks the action icon to add to wishlist
    And the user goes to the wishlist
    Then the user should see the movie "Onward" added to the wishlist




