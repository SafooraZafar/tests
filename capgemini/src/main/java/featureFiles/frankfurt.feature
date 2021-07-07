#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@capgeminiTests
Feature: Login smoketests
  I want to use this template for my feature file

  @capgeminiTests
  Scenario: Test that a user can access the api 
    Given the user is on the internet
    When the user enters the api endpoint
    Then the user can successfully access the api 
    
  @unsuccessfulAccess
    Scenario: Test that a user cannot access the api with the incorrect api
    Given the user is on the internet
    When the user enters incorrect the api endpoint
    Then the user cannot access the api 

  
    @frankfurt
  Scenario: Checking Frankfurt details are correct 
    Given the user is on the api homepage
    And frankfurt is found in the api
    When the details are returned 
    Then the country is correct 
    And the longitude is correct 
    And the latitude is correct 
  
