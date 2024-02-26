Feature: switch between multiple windows
  @Regression
  Scenario: user click on link which open new window
    then return to the previous window
    Given user go to multiple windows page
    And user click on link which open new window
    Then user retrun to the original window
