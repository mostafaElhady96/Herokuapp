Feature: test location feaute
  @Regression
  Scenario: user can allow location
    Given user go to location page
    When user click on location button
    Then Assert the location is right