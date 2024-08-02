@studymateFunctions
Feature: studymate functinalities
  Background:
    Given this url "https://batch-6.studymate.us/login"
    Then user enters email "admin@codewise.com"
    And user enters password "codewise123"
    Then user clicks on sign in

    @addteacherpositive
    Scenario: add teacher functionality
      And user clicks on teachers
      Then user clicks on add teacher
      And user enters username "Mary"
      And user enters lastname "doe"
      And user clicks on phonenumber
      And user enters phonenumber "5558889999"
      Then user enters email "mary.doe@gmail.com"
      Then user enters specilization "math"
      And user clicks on  choose course
      Then user clicks on test
      And user clicks on add
      Then user verifies the teacher info
      Then user close window

      @negativeaddteacher
      Scenario: add teacher with missing info

        And user clicks on teachers
        Then user clicks on add teacher
        And user enters username "Mary"
        And user enters lastname "doe"
        And user clicks on phonenumber
        And user enters phonenumber "5558889999"
        Then user enters incorrect email "mary.doe"
        Then user enters specilization "math"
        And user clicks on  choose course
        Then user clicks on test
        And user is not able to add info
        Then user clicks on cancle button
        Then user close window

        @addannouncementpositive
        Scenario: add an announcement

          Then user clicks on announcements
          And user clicks on add an announcement
          And user clicks on text of announcement
          And user enters a text of announcement "Admin"
          And user clicks on groups filed
          Then user clicks on test option
          And user clicks on add button
          Then user sees the announcemnts displayed
          Then user close window

          @negativeaddannouncement
          Scenario: add an announcement with no text

            Then user clicks on announcements
            And user clicks on add an announcement
            And user clicks on text of announcement
            And user enters a text of announcement ""
            And user clicks on groups filed
            Then user clicks on test option
            Then user is not able to click on add
            Then user close window














