Feature: studymate functinalities
  Background:
    Given this url "https://batch-6.studymate.us/login"
    Then user enters email "admin@codewise.com"
    And user enters password "codewise123"
    Then user clicks on sign in
    @addteacher
    Scenario: add teacher functionality
      And user clicks on teachers




