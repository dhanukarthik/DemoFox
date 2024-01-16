Feature: Registration functionality scenarios

  Background: Launch the application
  @Register @One
  Scenario: Verify whether the user is able to register into application
    Given Launch the application
    And Navigate to the account registration
    When User enter all the below valid details
          |FirstName | Dhanalakshmi|
          |LastName  |C N          |
          |Email     |test8431@gmail.com|
          |Telephone | 123456789       |
          |Password  | test@1234       |
          |ConfirmPassword|test@1234   |
    And Select the privacy policy
    And Click on the continue button
    Then User should be able to register successfully
  @Register @Two
  Scenario: Verify whether the user not allowed to register on skipping mandatory fields
  Given Launch the application
  And Navigate to the account registration
  When Click on the continue button
  Then User account should not be created
  And  Error message should display to the user to fill mandatory fields

@Register @Three
 Scenario: Verify whether the user is able to register with out selecting privacy and policy
  Given Launch the application
  And Navigate to the account registration
  When User enter all the below valid details
    |FirstName | Dhanalakshmi|
    |LastName  |C N          |
    |Email     |test8431@gmail.com|
    |Telephone | 123456789       |
    |Password  | test@1234       |
    |ConfirmPassword|test@1234   |
  And Select the privacy policy
  And Subscribe to the Newsletter
  And Click on the continue button
  Then User should be able to register successfully