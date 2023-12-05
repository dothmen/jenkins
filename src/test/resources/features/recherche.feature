@tag
Feature: search for reviews from a past session

  Background: 
    Given the administrator click on connexion icon
    And entersmouna.makni@talan.comandAdmin09$
    And clicks on identify button
    And clicks on the details icon
    And clicks on Evalution icon

  @Reaserch
  Scenario: check search functionality
    When the administtrator locate search bar
    And writes name of lecon Tester les APIs REST
    And check that search page displays Tester les APIs REST
    And writes name of module notions avancées
    And check that search page displays notions avancées
    And writes the evaluation score 5 votes
    Then check that search page displays 5 votes
