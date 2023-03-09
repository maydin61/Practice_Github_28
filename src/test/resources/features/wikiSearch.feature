
Feature: Wikipedia search functionality and verifications

  #WSF-3234 wikipedia search functionality

Background: For the scenarios in the feature file, user is expected
  Given user is on the library login page

  Scenario:  Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Elon Musk" in the wiki search box
    And User clicks wiki search button
    Then User sees "Elon Musk" is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Bill Gates" in the wiki search box
    And User clicks wiki search button
    Then User sees "Bill Gates" is in the main header

  Scenario: Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    When User types "Bill Gates" in the wiki search box
    And User clicks wiki search button
    Then User sees "Bill Gates" is in the  image header

    # formation a general step for a dynamic system using a table
    # DDT testing / data driven testing

  @scenarioOutline
  Scenario Outline:  Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    @Sciences
    Examples: search values we are going to be using in this senior is as below

          # header of table
      | searchValue  | expectedTitle | expectedMainHeader |
      | Steve Jobs   | Steve Jobs    | Steve Jobs         |
      | Bob Marley   | Bob Marley    | Bob Marley         |
      | Chuck Norris | Chuck Norris  | Chuck Norris       |

    @SoccerPlayer
    Examples:
      | searchValue  | expectedTitle | expectedMainHeader |
      | Marie Curie  | Marie Curie   | Marie Curie        |
      | Lady Gaga    | Lady Gaga     | Lady Gaga          |

# to beatify the pipes above
  # mac: command + option + L
  # windows: control + alt + L

