Feature: Profil feature
  Background: Login
    Given Input username "testingqa" and password "qwerty"
    When Click button sign in
    Then Login successfully and direct to homepage

    Scenario: Can Click Profile
      When click Burger Icon
      And click Profil Icon
      Then user direct to Profil page

    Scenario: Success Edit Profile
      When click Button Edit Profile
      And move to Edit Profil Page
      And input username "NyobaTesting", email "testing@gmail.com", phone "08654830"
      And click button save
        # Then Popup appear

#    Scenario : Edit Profil with username Null
#      When click Button Edit Profile
#      And move to Edit Profil Page
#      And Delete username field ( masi belum tau )
#      And click button save

  #    Scenario : Edit Profil with username Null
#      When click Button Edit Profile
#      And move to Edit Profil Page
#      And Delete email field ( masi belum tau )
#      And click button save

  #    Scenario : Edit Profil with username Null
#      When click Button Edit Profile
#      And move to Edit Profil Page
#      And Delete phone field (masi blm tau )
#      And click button save

  #    Scenario : Edit Profil with username Null
#      When click Button Edit Profile
#      And move to Edit Profil Page
#      And Delete username, email and phone field ( masi belum tau )
#      And click button save

    Scenario: Delete Account
      When Clik Delete Button




