Feature: Login Page Test

  @sanity @regression
  Scenario: User should should login successfully
    Given I Enter username
    When I Enter password
    And I Click on Login Button
    Then I Should Verify "Dashboard" Message
  @smoke @regression
  Scenario: User should see Orange HRM Logo
    When I am on Homepage
    Then I Should Verify Logo is Displayed

  @regression
  Scenario: User should should log out successfully
    Given I Login To The application
    When I Click on User Profile logo
    And I Mouse hover on Logout and click
    Then I Should Verify the text Login Panel is displayed