Feature: New group page

  Background: Can Login using registered account have no group
    Given Input username "testingqa" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to homepage

  Scenario: Check back button on header
    When Click back button on header new group
    Then Move to homepage
