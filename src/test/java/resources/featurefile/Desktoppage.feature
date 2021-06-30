Feature: Desktop page functionality
  As a user i want to click on desktop page and sort by Z to A
@Regression
  Scenario: User should be able to reverse products on desktop page
    Given I m on Homepage
    When I click on Computer tab
    And I click on desktop
    And I select from sort by "Name: Z to A"
    Then I should see products arranged in reverse alphabetical order