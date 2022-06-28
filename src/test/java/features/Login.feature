Feature: LoginFeature
  This feature is responsible for testing all scenarios for login of application

  Scenario: Check login with correct username and password
    Given I have navigated to the website
    And I open the home page of the website
    Then I click the login link
    When I enter username and password
      | UserID | Password |
      | 1303   | Guru99   |
    Then I click login button
    Then I should see the customer's page

