Feature: Login User
  As a user I want to be able to register on the Saucedemo page

  @smoke
  Scenario Outline: Enter the website and fill in the form
    Given the user wishes to login an account on the website
    When the user enters yours credentials
      | username | pwd        | date  | input   |
      | <user>   | <password> | <visit> | <comment> |
    Then he must display a message Appointment Confirmation
    Examples:
      | user     | password           | visit      | comment    |
      | John Doe | ThisIsNotAPassword | 05/10/2020 | Automation |