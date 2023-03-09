
Feature: As a user, I should be able to log out.


  Acceptance Criteria:

  1-User can log out and ends up in login page
  2-User can not go to home page again by clicking step back button after successfully logged out.


  Scenario:
    When user is on the login page
    And user enters the valid credentials "Employee75" and "Employee123"
    Then  User can log out and ends up in login page
    And User can not go to home page again by clicking step back button after successfully logged out
