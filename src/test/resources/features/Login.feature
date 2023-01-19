Feature: To Test Login Functionality


  Background:
    Given user open website
    And verify user is on login page
@Smoke
  Scenario: verify User Can Login Into Application
    When user enter the valid credentials
    Then verify home page is displayed
    And user open website

  @Smoke @Chirag
  Scenario: verify User cannot Login with invalid credentials
    When user enter the invalid credentials
    Then verify invalid login error message is displayed