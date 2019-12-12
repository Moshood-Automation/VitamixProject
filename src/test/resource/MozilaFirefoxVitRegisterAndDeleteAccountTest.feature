@mozila
Feature: Register Test

Background:
 Given i launch mozila firefox browser
 
@mozila
  Scenario: I want to register and delete my account successfully
    Given i am on the homepage
    And i click on allow all cookies link
    And i click my Account link
    And i click create an account link
    When i fill the form
    And i click the create account button
    Then my account should be created
    And i click the account information link
    And i click on Delete My Online Account link
    And i type DELETE
    When i click the delete button
    Then my account should be deleted
