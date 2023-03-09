Feature: Web table user order feature

  Scenario: User should be able to place an order and order seen in web table

    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "Master Card"
    And user enters credit card number "112234432424523552"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table


  Scenario Template: User should be able to place an order and order seen in web table

    Given user is already logged in and on order page
    When user selects product type "<product type>"
    And user enters quantity "<quantity>"
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipCode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table

      @femaleScientists
      Examples: Famous female scientists
        | product type | quantity | customerName | street    | city   | state   | zipCode | cardType         | cardNumber | expDate | expectedName |
        | MoneyCog     | 2        | Maria Curie  | London st | London | England | 50505   | Visa             | 3423423424 | 12/24   | Maria Curie  |
        | Familybea    | 1        | Franklin     | London st | London | England | 60505   | Master           | 3535345345 | 12/24   | Franklin     |
        | Screenable   | 5        | Barbara      | London st | London | England | 40505   | American Express | 3422343424 | 12/24   | Barbara      |
        | MoneyCog     | 4        | Curie        | London st | London | England | 30505   | Visa             | 3423423424 | 12/24   | Curie        |

      @maleScientists
      Examples: Famous male scientists
        | product type | quantity | customerName    | street    | city   | state   | zipCode | cardType         | cardNumber | expDate | expectedName    |
        | MoneyCog     | 2        | Charles Curie   | London st | London | England | 50505   | Visa             | 3423423424 | 12/24   | Charles Curie   |
        | Familybea    | 1        | Albert Franklin | London st | London | England | 60505   | Master           | 3535345345 | 12/24   | Albert Franklin |
        | Screenable   | 5        | Arnold          | London st | London | England | 40505   | American Express | 3422343424 | 12/24   | Arnold          |
        | MoneyCog     | 4        | Isaac           | London st | London | England | 30505   | Visa             | 3423423424 | 12/24   | Isaac           |