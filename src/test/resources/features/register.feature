Feature: Register

  @regression
  Scenario: User Should Navigate To Register Page Successfully
    Given I am on homepage
    When I click on register link
    Then I am in Register page

  @regression
  Scenario: Verify That FirstName LastName Email Password And ConfirmPassword Fields Are Mandatory
    Given I am on homepage
    When I click on register link
    And I click on Register Button
    Then I should see the First name is required error message
    And I should see the Last name is required error message
    And I should see the Email is required error message
    And I should see the Password is required error message
    And I should see the Confirm Password is required error message


  @regression
  Scenario: User should create account successfully
    Given I am on homepage
    When I click on register link
    And I enter First Name "Meet"
    And I enter Last Name "Patel"
    And I Select Day in Date Of Month Field
    And I Select Month in Date Of Month Field
    And I Select Year in Date Of Month Field
    And I enter Email "abc9@mail.com"
    And I enter Password "123456"
    And I enter Confirm Password "123456"
    And I click on Register Button
    Then registration successful







