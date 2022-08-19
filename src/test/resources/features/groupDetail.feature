@web
Feature: Group Detail page

  Background: Show Group Detail
    Given Input username "qalesgoo" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to group chat
    When Click group name
    Then directed to group detail page

  Scenario: Return back button function
    When Click back button
    Then directed to group chat page

  Scenario: Humberger icon function
    When Click humbergur icon
    Then Show profile, leave group, delete group, and logout button

  Scenario: Profile Button Functionality
    When Click humbergur icon
    Then Show profile, leave group, delete group, and logout button
    When Click profile icon on dropdown list group detail
    Then directed to profile

  Scenario: Leave group Button Functionality
    When Click humbergur icon
    Then Show profile, leave group, delete group, and logout button
    When Click leave group icon on dropdown list group detail
    Then directed to home page

  Scenario: Can click delete group at dropdown menu
    When Click humbergur icon
    When Click delete group on dropdown list group detail
    Then directed to home page

  Scenario: Can click logout at dropdown menu
    When Click humbergur icon
    When Click logout on dropdown list group detail
    Then Success direct to Sign in page



