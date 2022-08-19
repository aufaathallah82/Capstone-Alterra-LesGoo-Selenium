@web
Feature: Group Chat page

  Background: Show Group Pace
    Given Input username "qalesgoo" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to group chat

  Scenario: Hamburger Button Functionality
    When Click group burger icon
    Then Show profile, leave group, and logout button

  Scenario: Profile Button Functionality
    When Click group burger icon
    When Click profile icon
    Then directed to profile

  Scenario: Leave group Button Functionality
    When Click group burger icon
    When Click leave group icon
    Then directed to home page

  Scenario: Logout Button Functionality
    When Click group burger icon
    When Click logout group icon
    Then directed to login page

  Scenario: SOS Button Functionality
    When Click SOS icon
    Then Show SOS page

  Scenario: Chat Field Functionality
    When Click chat field
    When input "a1!"
    Then Show "a1!" in chat field

  Scenario: Chat Send Button Functionality
    When Click chat field
    When input "a1!"
    When Click send button
    Then Show "a1!" in group chat


