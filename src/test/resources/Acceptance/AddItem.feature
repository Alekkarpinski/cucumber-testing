@acceptance
Feature: Add item into the system

  In order to add item user should login to application

  Scenario: Successfully add item to application
    Given I am logged in into the system
    When I go to AddItemPage
    And I enter correct item data
    Then The item should be added