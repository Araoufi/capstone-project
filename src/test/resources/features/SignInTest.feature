Feature: Sign In Feature

  @signIn
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    When User enter email 'jamil.capstone1@tekschool.us' and password 'Jamil@12345'
    When User click on login button
    Then User should be logged in into Account

  @CreateAccount
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Creat New Account button
    And User fill the signUp information with below data
      | name         | email                       | password    | confirmPassword |
      | Jamil Raoufi | jamil.capstone5@tekschool.us | Jamil@12345 | Jamil@12345     |
    And User click on SignUp button
    Then User should be logged into account page
