@web
Feature: random test

  Background: Already at home page
    Given user at login page
    When user input username "dhandyjoehan"
    When user input password "qweqwe"
    When user click button login
    Then user successfully login

  Scenario: home button functionality

