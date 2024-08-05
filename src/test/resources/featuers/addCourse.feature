Feature:Adding Course
  Background:
    Given this url "https://batch-6.studymate.us/login"
    Then user enters email "admin@codewise.com"
    And user enters password "codewise123"
    Then user clicks on sign in


  @course
  Scenario: Successfully add a new course
    And the user clicks to the Courses page
    And the user clicks on the Add Course button
    And the user enters "CHECK CHECK" as the course name
    And the user enters "111124" as the date of finish
    And the user enters "RANDOM TEXT" as the description
    And the user clicks on the Create button
    Then the user should see the course "CHECK CHECK" in the list of courses