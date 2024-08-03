@DeleteTeachersFunctionality

  Feature: Delete Teachers Functionality
    Background:
      Given this url "https://batch-6.studymate.us/login"
      Then user enters email "admin@codewise.com"
      And user enters password "codewise123"
      Then user clicks on sign in

      Scenario: user wants to delete teachers
        And user clicks on teachers
        Then user click on 3 dot
        Then  user click on delete button
        Then user confirm delete on pop up
        Then user verify success deleting
