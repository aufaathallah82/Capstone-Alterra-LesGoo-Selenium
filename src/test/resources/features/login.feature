@web
Feature: Login page

  Scenario: Show login page
    Then Login page field is displayed

  Scenario: Show login page
    When Click Create an Account
    Then Move to register page

  Scenario: Can Login using registered account have no group
    Given Input username "testingqa" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to homepage

  Scenario: Can Login using registered account with have 1 group
    Given Input username "testingqa" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to group chat

  Scenario: Can Login using unregistered accoung
    Given Input username "abcde" and password "abcde"
    When Click button sign in
#    Then Show error state

  Scenario: Login without username
    Given Input username "" and password "qwerty"
    When Click button sign in
#    Then Make sure show error state

  Scenario: Login without password
    Given Input username "testingqa" and password ""
    When Click button sign in
#    Then Make sure show error state

  Scenario: Login without username and password
    Given Input username "" and password ""
    When Click button sign in
#    Then Make sure show error state

  Scenario: Login with invalid username and password
    Given Input username "wrongusername" and password "qwerty"
    When Click button sign in
#    Then Make sure show error state

  Scenario: Login with username and invalid password
    Given Input username "testingqa" and password "wrongpassword"
    When Click button sign in
#    Then Make sure show error state