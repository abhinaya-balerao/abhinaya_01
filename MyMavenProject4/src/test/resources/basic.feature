
@tag
Feature: practicing cucumber
  

  @google
  Scenario: Google page
    Given browser has been launched
    When user passed the url "https://www.google.com/"
    Then validate title of the page as "Google"
    When click on the searchbox and search for fashion and press enter
    Then validate that there are more than 5 links

  @example1
  Scenario Outline: Data Driven example
    Given I want to have two numbers <num1> and <num2>
    When I will add the string "<name>"
    Then I verify to print the result

    Examples: 
      | num1  | num2  | name  |
      | 1     |     5 | abhi |
      | 6     |     7 | ashu |
