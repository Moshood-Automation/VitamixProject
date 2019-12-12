@chrome
Feature: Change Password Test

Background: 
    Given i launch google chrome browser
@chrome
  Scenario: I want to change my password and delete my account successfully
    Given i am on the homepage
    And i click on allow all cookies link
    And i click my Account link
    And i click create an account link
    When i fill the form
    And i click the create account button
    Then my account should be created
    And i click the account information link
    And i click change password
    When i enter my current password
    And i enter my new password
    And i repeat my new password
    When i click the change password button
    And i click on save changes button
    Then my password should be changed
    And i click the account information link
    And i click on Delete My Online Account link
    And i type DELETE
    When i click the delete button
    Then my account should be deleted
