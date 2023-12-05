@tag
Feature: pagination of past session evaluations

  Background: 
    Given the administrator click on connexion icon
    And entersmouna.makni@talan.comandAdmin09$
    And clicks on identify button
    And clicks on the details icon
    And clicks on Evalution icon

  @Pagination
  Scenario: check the functionality of switching from one page to another valid
    When click on next icon page
    Then verify that the next page  is displayed

  @PaginationFilter
  Scenario Outline: check valid paging filter functionality
    When click on next icon page
    And click on filter 20
    Then check that the page only contains the selected number of evalutions

  @PaginationArrow
  Scenario Outline: check functionality of arrows (right and left) to navigate between pages valid
    When click on next icon page
    And click on the left icon to return to the previous page
    And check that the previous page is display
    And click on the right icon to go to the next page
    Then check that the next page is display
