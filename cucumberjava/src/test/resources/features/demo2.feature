Feature: demo login functionality

  Scenario Outline: Check login  with valid credentials
    Given user calculates 1/0
    And user is on login page
    When user enters <username> and <password>
    And user clicks login
    Then user is navigated to the homepage
