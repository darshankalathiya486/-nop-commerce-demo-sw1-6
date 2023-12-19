Feature: Login Feature


  @regression
  Scenario: User should navigate to login page successfully
      Given I am on homepage
      When I click on login link
      Then I should navigate to login page successfully

  @regression
  Scenario: User Verify The Error Message With InValid Credentials
      Given I am on homepage
      When I click on login link
      And I enter Email "abc67@gmail.com"
      And I enter Password "123456"
      And I click on Login Button
      Then I should see the error message


  @regression
  Scenario: User Should LogIn Success Fully With Valid CredentialsGiven I am on homepage
      Given I am on homepage
      When I click on login link
      And I enter Email "abc9@mail.com"
      And I enter Password "123456"
      And I click on Login Button
      Then I should Verify the Log Out Link


  @regression
  Scenario: User Should Log Out Success Fully
      Given I am on homepage
      When I click on login link
      And I enter Email "abc9@mail.com"
      And I enter Password "123456"
      And I click on Login Button
      And I click on Log Out Link
      Then I should Verify the Log In Link




