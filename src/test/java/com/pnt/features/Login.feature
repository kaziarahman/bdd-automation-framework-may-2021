Feature: Login functionality

  Scenario: user being able to login successfully
    Given user opens the browser and navigate to facebook.com
    When user fills username field
    Then user fills password field
    And user clicks on sign in button
    And user is logged in successfully

