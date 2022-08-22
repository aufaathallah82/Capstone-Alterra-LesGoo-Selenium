@web
Feature: Join Group page

  Background: Login
    Given Input username "troll" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to homepage
    Given Click button join group

  Scenario: Show join group page
    Then Join group page field is displayed
    When Click back button on header join group
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Check back button on header
    When Click back button on header join group
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Can join using valid groupId
    Then Join group page field is displayed
    When Input valid groupId "9dd7b7e2-a47c-4fbd-91c2-e2f66bde469a"
    And Click button join
    Then Login successfully and direct to group chat
    When Click group burger icon
    When Click leave group icon
    Then Homepage is displayed
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Can join using invalid groupId
    When Input valid groupId "qweqweqwe"
    And Click button join
    Then Click ok alert message
    When Click back button on header join group
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Can join using empty value groupId
    When Input valid groupId ""
    And Click button join
    Then Click ok alert message
    When Click back button on header join group
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page