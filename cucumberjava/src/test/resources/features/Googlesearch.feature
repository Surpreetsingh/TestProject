Feature: feature to test google search functionality

  Scenario: Validate google search is working
    Given Browser is open
    And user is on google search page
    When user enters a text in search in text box
    And hits enter
    Then user is navigated to search results
