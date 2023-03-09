@Regression  @login
Feature: Library app login feature
  User story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: librarian, student, admin
                      # working in progress @wip

  Background: For the scenarios in the feature file, the user is expected to be on login page
      # Background runs before each SCENARIO in that SPECIFIC FEATURE FILE.
      # The step we pass under the "Background:" will execute only once before each step
    Given the user is on the login page
    Then user should see the dashboard

  @librarian @employee
  Scenario: Login as librarian
  #  Given the user is on the login page ( was delete because of Background key word and follow with the Given ..........)
    When user enters librarian username
    And user enters librarian password
  #  Then user should see the dashboard

  @student @database
  Scenario: Login as student
 #   Given the user is on the login page
    When user enters student username
    And user enters student username
  #  Then user should see the dashboard

  @admin @employee
  Scenario: Login as admin
 #   Given the user is on the login page
    When user enters admin username
    And user enters admin username
  #  Then user should see the dashboard






    # this how we add the comments