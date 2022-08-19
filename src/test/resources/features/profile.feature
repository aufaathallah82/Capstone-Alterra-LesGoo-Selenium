Feature: Profil page

  Background: Login
    Given Input username "testingqa" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click profile


    ## Profile page
  Scenario: Show profile page
    Then Profile page field is displayed

  Scenario: Check back button on header
    When Click back button on header profile
    Then Move to homepage

  Scenario: Validate profile is correct
    Then Text username should be "testingqa"
    And Text email should be "testingqa@gmail.com"
    And Text phone should be "666"




    ## Edit Profile page
  Scenario: Can direct to edit profile
    When Click button Edit Profile
    Then Move to edit profile page

  Scenario: Success Edit Profile
    When Click button Edit Profile
    And move to Edit Profil Page
    And input username "nyobaTesting", email "testing@gmail.com", phone "08654830"
    And click button save
      # Then Popup appear

  Scenario : Edit Profil with username Null
    When Click button Edit Profile
    And move to Edit Profil Page
    And clear username field
    And click button save

  Scenario : Edit Profil with username Null
    When Click button Edit Profile
    And move to Edit Profil Page
    And clear email field
    And click button save

  Scenario : Edit Profil with username Null
    When Click button Edit Profile
    And move to Edit Profil Page
    And clear phone field
    And click button save

  Scenario : Edit Profil with username Null
    When Click button Edit Profile
    And move to Edit Profil Page
    And clear username, email and phone field
    And click button save

  Scenario: Delete Account
    When Click delete account button