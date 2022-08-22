@web
Feature: Profil page

  Background: Login
    Given Input username "troll" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click profile

    ## Profile page
  Scenario: Show profile page
    Then Profile page field is displayed
    When Click back button on header profile
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Check back button on header
    When Click back button on header profile
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Validate profile is correct
    Then Text username should be "troll"
    And Text email should be "troll@gmail.com"
    And Text phone should be "875554225"
    When Click back button on header profile
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page



    ## Edit Profile page
  Scenario: Can direct to edit profile
    When Click button Edit Profile
    Then Move to edit profile page
    And Click back button on header edit profile
    When Click back button on header profile
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

#  Scenario: Success Edit Profile
#    When Click button Edit Profile
#    Then Move to edit profile page
#    And input username "qualitytesting", email "qualitytesting@gmail.com", phone "98878554662"
#    And click button save
#      # Then Popup appear

  Scenario: Edit Profil with username null
    When Click button Edit Profile
    Then Move to edit profile page
    And clear username field
    And click button save
    And Click button ok pop up
    When Click back button on header profile
    And Click back button on header edit profile
    When Click back button on header profile
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page


  Scenario: Edit Profil with email Null
    When Click button Edit Profile
    Then Move to edit profile page
    And clear email field
    And click button save
    And Click button ok pop up
    When Click back button on header profile
    And Click back button on header edit profile
    When Click back button on header profile
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Edit Profil with phone Null
    When Click button Edit Profile
    Then Move to edit profile page
    And clear phone field
    And click button save
    And Click button ok pop up
    When Click back button on header profile
    And Click back button on header edit profile
    When Click back button on header profile
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Edit Profil with all field is Null
    When Click button Edit Profile
    Then Move to edit profile page
    And clear username, email and phone field
    And click button save
    And Click button ok pop up
    When Click back button on header profile
    And Click back button on header edit profile
    When Click back button on header profile
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page

  Scenario: Delete Account
    When Click back button on header profile
    Then Move to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click logout
    And Success direct to Sign in page
    When Click Create an Account
    Given Input username "pou", email "pou@gmail.com", phone "8858569625", password "qwerty"
    When Click button sign up
    Then Move to sign in page
    Given Input username "pou" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to homepage
    When Click burger icon
    And Show dropdown menu
    Then Click profile
    And Success direct to Profile page
    When Click button Edit Profile
    Then Move to edit profile page
    When Click delete account button
    And Click button ok pop up delete account
    And Success direct to Sign in page