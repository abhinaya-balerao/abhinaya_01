@tag
Feature: Google

  @google @all
  Scenario: Search for an item in google
    Given browser has been launched
    When user opens url "https://www.google.co.in"
    Then a page with title "Google" should appear
    When user search for a text in google search box and press enter
    Then atleast 5 links related to that text should appear
    And close the browser

	@amazon @all
	Scenario: Search in amazon
		Given browser has been launched
    When user opens url "https://www.amazon.in/" 
    Then a page with title "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" should appear
    When user search for a text in amazon search box and press enter
    Then atleast 4 links related to that text should appear
    And close the browser