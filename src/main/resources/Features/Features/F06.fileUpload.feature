Feature: testing upload file
  @Regression
  Scenario: user upload file
    Given user go to upload file page
    And user upload chosen file
    And user click on upload button
    Then assert on file uploading