@web
Feature: Join Group page

  Scenario: Show join group page
    Then Join group page field is displayed

  Scenario: Check back button on header
    When Click back button on header join group
    Then Move to homepage

  Scenario: Can join using valid groupId
    When Input valid groupId "valid group"
#    Then Move to homepage  belum tau

  Scenario: Can join using invalid groupId
    When Input valid groupId "invalid group"
#    Then Move to homepage  belum tau

  Scenario: Can join using invalid groupId
    When Input valid groupId ""
#    Then Move to homepage  belum tau