Feature: user can check and uncheck box
  @Regression
  Scenario: user check box 1 and uncheck box 2
    Given user go to check box page
    When user check box one
    Then box one checked
    And user uncheckbox two
    Then box two unchecked