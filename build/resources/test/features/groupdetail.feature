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
    Then Show profile, leave group, delete group, and logout button

  Scenario: Profile Button Functionality
    When Click option button
    When Click profile icon
    Then directed to profile

  Scenario: Leave group Button Functionality
    When Click option button
    When Click leave group icon
    Then directed to home page

  Scenario: Can click logout at dropdown menu
    When Click option button
    When Click logout
    Then Success direct to Sign in page



