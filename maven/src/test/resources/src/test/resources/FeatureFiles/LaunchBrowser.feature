Feature: Launch Chrome Browser

  Scenario: Launch Chrome browser and open a website
    Given I launch the Chrome browser
    When I navigate to "https://example.com"
    Then I verify the page title is "Example Domain"
