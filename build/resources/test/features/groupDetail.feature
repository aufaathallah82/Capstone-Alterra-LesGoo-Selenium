@web
Feature: Group Detail page

  Background: Show Group Detail
    Given Input username "jenny2" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to group chat
    When Click group burger icon
    When Click group detail icon
    Then directed to group detail page

  Scenario: Return back button function
    When Click back button group detail
    Then directed to group chat page
    When Click group burger icon
    When Click logout group icon
    Then directed to login page

  Scenario: Profile Button Functionality
    When Click humbergur icon
    Then Show profile, leave group, delete group, and logout button
    When Click profile icon on dropdown list group detail
    Then directed to profile
    When Click back button on header profile
    When Click back button group detail
    Then directed to group chat page
    When Click group burger icon
    When Click logout group icon
    Then directed to login page

#  Scenario: Leave group Button Functionality
#    When Click humbergur icon
#    Then Show profile, leave group, delete group, and logout button
#    When Click leave group icon on dropdown list group detail
#    Then directed to home page
#
#  Scenario: Can click delete group at dropdown menu
#    When Click humbergur icon
#    Then Show profile, leave group, delete group, and logout button
#    When Click delete group on dropdown list group detail
#    Then directed to home page
#
#  Scenario: Can click logout at dropdown menu
#    When Click humbergur icon
#    Then Show profile, leave group, delete group, and logout button
#    When Click logout on dropdown list group detail
#    Then Success direct to Sign in page



