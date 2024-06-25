@author_Priyanka @regression
Feature: Top menu feature
  As a user I want to navigate on different menu

  @author_Priyanka @smoke @sanity
  Scenario: Verify user should navigate to desktops page successfully
    Given I am on Homepage
    When I mouse hover on desktop link and click
    And I call select menu and pass "Show AllDesktops"
    Then I should see the text "Desktops"

  @author_Priyanka @smoke
  Scenario: Verify user should navigate to laptop and notebook page successfully
    Given I am on Homepage
    When I mouse hover on laptop and notebook link and click
    And I call select method and pass "Show AllLaptops & Notebooks"
    Then I should see the title text "Laptops & Notebooks"

  @author_Priyanka
  Scenario: Verify user should navigate to computer page successfully
    Given I am on Homepage
    When I mouse hover on computer and click on "Components"
    And I call select menu method and pass "Show AllComponents"
    Then I should verify text "Components"