Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in Option
    And user enter email 'jamil.capstone5@tekschool.us' and password 'Tek@54321'
    And User click on Login button
    And User should be logged in into account
    When User click on Account option

  @UpdateInfo
  Scenario: Verify User can update Profile Information
    And User update Name 'Abdul J Raoufi' and Phone '5403762773'
    And User click on Update button
    Then User profile information should be updated

  @ChangePassword
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tek@12345        | Tek@54321   | Tek@54321       |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @Payment
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 5205200004440520 | Abdul Raoufi |              12 |           2025 |          520 |
    And user Click on add your card button
    Then a message should be displayed Payment Method added successfully

  @UpdateCrad
  Scenario: Verify User can edit Debit or Credit card
    And User select the payment Card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 5200009654958555 | AJRaoufi   |              12 |           2024 |          911 |
    And user click on Update Your Card button
    Then a message should be displayed Payment Method updated Successfully

  @RemoveCard
  Scenario: Verify User can remove Debit or Credit card
    And User select the payment Card
    And User click on remove option of card section
    Then payment details should be removed

  @AddAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName       | phoneNumber | streetAddress      | apt | city      | state    | zipCode |
      | United States | Ferdows Raoufi |  2024555050 | 3533 Alexandria Rd | D55 | Lynchburg | Virginia |   24501 |
    And User click on Add Your Address button
    Then a message should be displayed Address Added Successfully

  @EditAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And User fill new address form with below information
      | country       | fullName      | phoneNumber | streetAddress   | apt | city    | state    | zipCode |
      | United States | Farhan Raoufi |  5406262620 | 4550 Roanoke St | B20 | Roanoke | Virginia |   24019 |
    And User click update Your Address button
    Then a message should be displayed Address Updated Successfully

  @RemoveOldAddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
