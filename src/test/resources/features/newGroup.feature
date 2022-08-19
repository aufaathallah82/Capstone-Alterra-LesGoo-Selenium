Feature: New group page

  Background: Can Login using registered account have no group
    Given Input username "testingqa" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to homepage

  Scenario: Can Add New Group
    Given click button Add Group
    And Move to Add Group Page
    And input Group Name "Testing", Dec "APAAJA", Start Date "17/08/2022", end date "18/08/2022"
    # And set MAP START and MAP END " Masi belum tau"
    And clik Button Save