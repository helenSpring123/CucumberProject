Feature: check trashFunctionality

  Background:
    Given the user is on "https://batch-6.studymate.us/login"


  @positiveTrash
  Scenario: to check  trashFunctionality is work
    When user enter the username "admin@codewise.com" and password "codewise123" and language "English"
    And user click button
    And user go to trash
    And user click trashBytton
    Then user see its delated
