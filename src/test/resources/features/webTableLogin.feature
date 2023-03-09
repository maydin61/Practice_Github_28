
Feature: user should be able to login using correct credential

  Background: user is on the login page
    Given user is on the login page of web table app
                                                    # like Before method repeating step

  Scenario: Positive login scenario
                                                     #Given user is on the login page of web table app
    When user enter username "Test"
    And usr enter password "Tester"
    And user clicks to login button
    Then user should see url contains orders

  Scenario: Positive login scenario
                                                     #Given user is on the login page of web table app
    When user enter username "Test" password "Tester" and login
    Then user should see url contains orders

    #1 - implement this new step
    #2 - create login method in WebTableLoginPage
    #3 - this login method should have multiple different overload version


  Scenario: User should be able to see all 12 months in months dropdown
                                                   #Given user is on the login page of web table app
    When user enters below credentials
      | username | Test   |
      | password | Tester |
    # table used as Map table in Java in coding
    Then user should see url contains orders