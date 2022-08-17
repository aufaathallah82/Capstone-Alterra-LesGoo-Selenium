@web
Feature: Register page

  Scenario: Show register page
    Then Register page field is displayed

  Scenario: Can Click Text Link Login Now
    When Click Login now
    Then Move to sign in page

  Scenario: Register user with valid data
    Given Input username "cobatesting", email "cobatesting@gmail.com", phone "024114", password "qwerty"
    When Click button sign up
#    Then Move to sign in page    belum tahu

  Scenario: Register user without fill username
    Given Input username "", email "cobatesting@gmail.com", phone "024114", password "qwerty"
    When Click button sign up
#    Then Move to sign in page    belum tahu

  Scenario: Register user without fill email
    Given Input username "cobatesting", email "", phone "024114", password "qwerty"
    When Click button sign up
#    Then Move to sign in page    belum tahu

  Scenario: Register user without fill phone
    Given Input username "cobatesting", email "cobatesting@gmail.com", phone "", password "qwerty"
    When Click button sign up
#    Then Move to sign in page    belum tahu

  Scenario: Register user without password
    Given Input username "cobatesting", email "cobatesting@gmail.com", phone "024114", password ""
    When Click button sign up
#    Then Move to sign in page    belum tahu

  Scenario: Register user without fill all the field
    Given Input username "", email "", phone "", password ""
    When Click button sign up
#    Then Move to sign in page    belum tahu

  Scenario: Register user with existing username
    Given Input username "testingqa", email "testingqa@gmail.com", phone "123456879", password "qwerty"
    When Click button sign up
#    Then Move to sign in page    belum tahu