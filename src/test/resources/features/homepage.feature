@web
Feature: Homepage

  Scenario: Homepage is displayed
    Then Homepage is displayed

  Scenario: Can click burger icon
    When Click burger icon
    Then Show dropdown menu

  Scenario: Can minimize burger icon after the second click
    Given Click burger icon
    When Show dropdown menu
    And Click burger icon
    Then Make sure dropdown menu is minimize

  Scenario: Can click profile at dropdown menu
    When Click burger icon
    And Show dropdown menu
    Then Click profile
    And Success direct to Profile page

  Scenario: Can click logout at dropdown menu
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Can click button New Group
    Given Click button new group
    Then Success direct to New Group page

  Scenario: Can click button Join Group
    Given Click button join group
    Then Success direct to Join Group page