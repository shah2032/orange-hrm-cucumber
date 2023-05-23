Feature: User Test
  @sanity @regression
  Scenario: Admin should add user successfully
    Given I am on Homepage
    When I Login to Application
    And I click on that Admin Tab
    Then I Should Verify System Users Text
    And click On Add button
    Then I Should Verify Add User Text
    And I Select User Role Admin
    And I enter Employee Name Ananya Dash
    And I enter Username
    And I Select status Disable
    And I enter password
    And I enter Confirm Password
    And I click On Save Button
    Then I Should verify message Successfully Saved

  @smoke @regression
  Scenario: Search the user that created and Verify that user
    Given I am on Homepage
    When I Login to Application
    And I click on Admin Tab
    Then I Should Verify System Users Text
    And I enter Username
    And I Select User Role
    And I Select the Status Enable
    And I Click on Search Button
    Then I Should Verify the User should be in Result list

  @regression
  Scenario: Admin should delete user successfully
    Given I am on Homepage
    When I Login to Application
    And I click on Admin Tab
    Then I Should Verify System Users Text
    And I enter Username
    And I Select User Role
    And I Select Status Enable
    And I Click on Search Button
    Then I Should Verify that User should be in Result list
    And I Click on Check box
    And I Click on Delete Button
    And I Click on Ok Button on Popup
    Then I should verify message Successfully Deleted

  @regression
  Scenario: Search the delete user and verify the message No Record Found
    Given I am on Homepage
    When I Login to Application
    And I click on Admin Tab
    Then I Should Verify System Users Text
    And I enter Username
    And I Select User Role
    And I Select a Status Disable
    And I Click on Search Button
    Then I verify message No Records Found
