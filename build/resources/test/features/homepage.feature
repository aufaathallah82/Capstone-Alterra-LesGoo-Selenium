@web
Feature: Homepage page

  Background:
    Given Input username "troll" and password "qwerty"
    When Click button sign in

  Scenario: Homepage is displayed
    Then Homepage is displayed
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Can click burger icon
    Then Homepage is displayed
    When Click burger icon
    Then Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

#  Scenario: Can minimize burger icon after the second click
#    Given Click burger icon
#    When Show dropdown menu
#    And Click burger icon
#    Then Make sure dropdown menu is minimize

  Scenario: Can click profile at dropdown menu
    Then Homepage is displayed
    When Click burger icon
    And Show dropdown menu
    Then Click profile
    And Success direct to Profile page
    When Click back button on header profile
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Can click logout at dropdown menu
    Then Homepage is displayed
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Can click button New Group
    Then Homepage is displayed
    Given Click button new group
    Then Success direct to New Group page
    When Click back button on header new group
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Can click button Join Group
    Then Homepage is displayed
    Given Click button join group
    Then Success direct to Join Group page
    When Click back button on header join group
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page