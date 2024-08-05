@DeleteCoursesFunctionality

Feature: Delete Courses Functionality
  Background:
    Given this url "https://batch-6.studymate.us/login"
    Then user enters email "admin@codewise.com"
    And user enters password "codewise123"
    Then user clicks on sign in

  Scenario: user wants to delete Courses
    And user clicks on Courses
    Then user click on 3 dot for Courses
    Then  user click on delete button for Courses
    Then user confirm delete on pop up for Courses
    Then user verify success deleting "The course successfully deleted"
