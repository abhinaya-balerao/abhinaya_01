@tag
Feature: Google

  @google @all
  Scenario: Search for an item in google
    #Given browser has been launched
    When user opens url "https://www.google.co.in"
    Then a page with title "Google" should appear
    When user search for a text in google search box and press enter
    Then atleast 5 links related to that text should appear
    #And close the browser

  @amazon @all
  Scenario: Search in amazon
    #Given browser has been launched
    When user opens url "https://www.amazon.in/"
    Then a page with title "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" should appear
    When user search for a text in amazon search box and press enter
    Then atleast 4 links related to that text should appear
    And close the browser

  @outline @all
  Scenario Outline: Data driven testing with outline
    Given user enters two numbers as <Num_One> and <Num_Two>
    When it get adds up with name as "<Name>"
    Then it should print the result

    Examples: 
      | Num_One | Num_Two | Name     |
      |       2 |       3 | Radha    |
      |      67 |      43 | Abhinaya |

  @tablecheck
  Scenario: To get data as table
    Given user enters two numbers as 5 and 6
    When user check for groceries list
      | Sugar    |  30 | 2 |
      | Salt     |  12 | 5 |
      | Biscuits |  45 | 3 |
      | Borvita  | 120 | 5 |
