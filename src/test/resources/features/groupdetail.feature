@web
Feature: random test

  Background: Show Group Detail
    Given Input username "testingqa" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to group chat
    When Click group name
    Then directed to group detail page

  Scenario: Return Button Functionality
    When Click return button
    Then directed to group chat page

  Scenario: Option Button Functionality
    When Click option button
#    Then ???



