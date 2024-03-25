Feature: Login Action
  Description: This feature will test the LogIn and LogOut functionality

  Scenario Outline: Login with valid and invalid credentials
    Given User is on Home Page
    When User navigate to Login Page
    Then User enters "<username>" and "<password>"
    And Keeping case as <Case>
    Then User should get logged in
    And Message displayed Login Successfully

  Examples:
    | username                | password   | Case    |
    | asha03deepu@gmail.com   | test123    | Valid   |
    | asha03deepu@gmail.com   | test12     | Invalid |
