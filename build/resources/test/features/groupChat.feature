@web
Feature: Group Chat page

  Background: Show Group Pace
    Given Input username "jenny2" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to group chat

  Scenario: Hamburger Button Functionality
    When Click group burger icon
    Then Show profile, leave group, and logout button

  Scenario: Profile Button Functionality
    When Click group burger icon
    When Click profile icon
    Then directed to profile

  Scenario: Group detail Button Functionality
    When Click group burger icon
    When Click group detail icon
    Then directed to group detail

  Scenario: Leave group Button Functionality
    When Click group burger icon
    When Click leave group icon
    Then directed to home page

  Scenario: Logout Button Functionality
    When Click group burger icon
    When Click logout group icon
    Then directed to login page

