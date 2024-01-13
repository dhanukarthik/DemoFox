Feature: Registration functionality scenarios

  @Register @One
  Scenario: Verify whether the user is able to register into application
    Given Launch the application
    And Navigate to the account registration
    When User enter all the below valid details
          |FirstName | Dhanalakshmi|
          |LastName  |C N          |
          |Email     |test123@gmail.com|
          |Telephone | 123456789       |
          |Password  | test@1234       |
    And Select the privacy policy
    And Click on the continue button
    Then User should be able to register successfully