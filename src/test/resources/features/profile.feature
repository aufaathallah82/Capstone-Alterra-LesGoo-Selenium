Feature: Profil feature
  Background: Login
    Given Input username "testingqa" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to homepage

    Scenario: Can Click Profile
      When click Burger Icon
      And click Profil Icon
      Then user direct to Profil page