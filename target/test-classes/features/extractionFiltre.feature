@tag
Feature: extraction and filtering of evaluations from a past session

  Background: 
    Given the administrator click on connexion icon
    And entersmouna.makni@talan.comandAdmin09$
    And clicks on identify button
    And clicks on the details icon
    And clicks on Evalution icon

  @ExtractionFilter
  Scenario: extraction and filtering of evaluations from a past session
    When extract data evaluation of past session
    And filter the evaluations which have scores less than or equal to 3 and which have a comment
    
