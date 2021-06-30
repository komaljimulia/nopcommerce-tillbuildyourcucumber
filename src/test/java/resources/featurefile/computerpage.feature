Feature: Top Menu test
  As a user i should be able to click on all tabs

@Smoke
  Scenario: User should be able to click on all tabs
    Given I m on Homepage
    When I click on any tabs "Computers" from all tabs
    Then I should navigate to selected tabs

