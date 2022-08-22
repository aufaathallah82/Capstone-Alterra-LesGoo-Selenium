@web
Feature: Login page

  Scenario: Show login page
    Then Login page field is displayed

  Scenario: Check text link Create an Account
    When Click Create an Account
    Then Move to register page

  Scenario: Can Login using registered account have no group
    Given Input username "nobita" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to homepage

  Scenario: Can Login using registered account with have 1 group
    Given Input username "jenny2" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to group chat

  Scenario: Can Login using unregistered account
    Given Input username "qweqweqwe" and password "qweqweqwe"
    When Click button sign in
    Then Login page field is displayed
#    Then Show error state

  Scenario: Login without username
    Given Input username "" and password "qwerty"
    When Click button sign in
#    Then Make sure show error state

  Scenario: Login without password
    Given Input username "testingqa" and password ""
    When Click button sign in
    Then Login page field is displayed
#    Then Make sure show error state

  Scenario: Login without username and password
    Given Input username "" and password ""
    When Click button sign in
    Then Login page field is displayed
#    Then Make sure show error state

  Scenario: Login with invalid username and password
    Given Input username "wrongusername" and password "qwerty"
    When Click button sign in
    Then Login page field is displayed
#    Then Make sure show error state

  Scenario: Login with username and invalid password
    Given Input username "testingqa" and password "wrongpassword"
    When Click button sign in
    Then Login page field is displayed
#    Then Make sure show error state