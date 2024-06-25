@regression
Feature: My account feature

Feature: My Account Test
As a user, I want to check login/logout/register functionality

  Background: I am on homepage

 @author_Priyanka @sanity @smoke
  Scenario: User should navigate to register page successfully
    When I click on my account link
    And I call the method selectMyAccountOptions method and pass the parameter "Register"
    Then I should see text register account

  @author_Priyanka @smoke
  Scenario: User should navigate to login page successfully
    When I click on my account link
    And I call the method selectMyAccountOptions method and pass the parameter "Login"
    Then I should see text returning customer

  @author_Priyanka
  Scenario: User should register account successfully
    When I click on my account link
    And I call the method selectMyAccountOptions method and pass the parameter "Register"
    And I enter First Name "Priyanka"
    And I enter Last Name "Korat"
    And I enter Email "sanganipriyanka"
    And I enter Telephone "07678678678"
    And I enter Password "Test@123"
    And I enter Confirm Password "Test@123"
    And I select Subscribe Yes radio button
    And I click on Privacy Policy check box
    And I click on Continue button for registration
    And I should see the message Your Account Has Been Created!
    And I click on Continue button
    And I click on my account link
    And I call the method selectMyAccountOptions method and pass the parameter "Logout"
    And I should see the text Account Logout
    Then I click on Continue button

  @author_Priyanka
  Scenario: User should login and logout successfully
    When I click on my account link
    And I call the method selectMyAccountOptions method and pass the parameter "Login"
    And I enter Email "sanganipriyankasKQ@gmail.com" on login page
    And I enter password "Test@123" on login page
    And I click on login button
    And I should see My Account text
    And I click on my account link
    And I call the method selectMyAccountOptions method and pass the parameter "Logout"
    And I should see the text Account Logout
    Then I click on Continue button