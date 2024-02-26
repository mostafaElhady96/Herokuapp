Feature: context menu
  @Regression
  Scenario: user try context menu
    Given user go to context menu page
    And click Rightclick
    Then Alert appear and click enter
