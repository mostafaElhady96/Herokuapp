Feature: dealing with 3 alert
  @Regression
  Scenario: deal with 3 alert
    Given user go to javaScript alert page
    When user click on js Alert
    Then accept alert
    When user click on js confirm
    Then confirm it
    When user click js prompt
    And user send  word like "Mostafa Elhady"
    Then assert the word "Mostafa Elhady" in result