@DeleteStudentsFunctionality

Feature: Delete Students Functionality
  Background:
    Given this url "https://batch-6.studymate.us/login"
    Then user enters email "admin@codewise.com"
    And user enters password "codewise123"
    Then user clicks on sign in

  Scenario: user wants to delete Students
    And user clicks on Studens
    Then user click on 3 dot for Students
    Then  user click on delete button for Students
    Then user confirm delete on pop up for Studets
    Then user verify success deleting Students "Student successfully deleted"