Feature:Adding Students
  Background:
    Given this url "https://batch-6.studymate.us/login"
    Then user enters email "admin@codewise.com"
    And user enters password "codewise123"
    Then user clicks on sign in






      @student
      Scenario: Successfully add a new student
        When the user clicks to the Students page
        Then the user clicks on the Add Student button
        And the user enters "Azizbek" as the first name
        And the user enters "Usman" as the last name
        And the user enters "3316885497" as the phone number
        And the user enters "azizusmanuulu@gmail.com" as the email
        And the user selects the Test Group from the group options
        And the user selects Offline as the study format
        And the user clicks on the Add button
        And the user should see the student "Azizbek Usman" in the list of students
        And the user clicks on the Cancel button
