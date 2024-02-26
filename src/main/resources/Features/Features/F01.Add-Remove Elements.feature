
Feature: add and remove element

  Scenario: user add element and remove it
    Given user go to add and remove element page
    When user click on add element
    Then new element should be added
    When user click on remove element
    Then new element should be removed


  @Regression
    Scenario: user can add and remove multiple elements
      Given user go to add and remove element page
      When user click on add element for "7" times
      Then "7" new element should be added
      When user click on remove element "7" times
      Then new elements should be removed
