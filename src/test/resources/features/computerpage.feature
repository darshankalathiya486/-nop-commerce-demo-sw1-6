Feature: Computer Feature


  @regression
  Scenario: User Should Navigate To Computer Page Successfully
    Given I am on homepage
    When I click on Computers Tab
    Then I should navigate to Computers page successfully

  @regression
  Scenario: User Should Navigate To Desktops Page Successfully
    Given I am on homepage
    When I click on Computers Tab
    And I click on Desktop Tab
    Then I should navigate to Desktop page successfully

  @regression
  Scenario Outline: User Should Build You Own Computer And Add Them To Cart Successfully
    Given I am on homepage
    When I click on Computers Tab
    And I click on Desktop Tab
    And I click on Click on product name Build your own computer
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    And I click On Add To Cart Button
    Then I add Product Successfully In Cart
    Examples:
      |       processor                                     |      ram         |       hdd              |   os                     |        software                      |
      |  2.2 GHz Intel Pentium Dual-Core E2200              |      3           |       320 GB           |   Vista Home [+$50.00]   |        Microsoft Office [+$50.00]    |
      |  2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]    |      4           |  400 GB [+$100.00]     |  Vista Premium [+$60.00] |        Acrobat Reader [+$10.00]      |
      |  2.2 GHz Intel Pentium Dual-Core E2200              |      5           |       320 GB           |   Vista Home [+$50.00]   |        Total Commander [+$5.00]      |








