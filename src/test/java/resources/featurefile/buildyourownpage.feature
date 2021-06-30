Feature: BuildYourOwn test
  As a user user i want to build my own computer
@Sanity
  Scenario:  User should navigate to Build your Own Computer Page successfully
    Given I m on Homepage
    And I click on 'Computer tab'
    And I click on 'desktop'
    And I select from sort by "Name: A to Z"
    And I click on 'add to cart' button
    When I see 'build your own' page
    And I select "2.2 GHz Intel Pentium Dual-Core E2200" from dropdown
    And I select "8GB [+$60.00]" ram from dropdown list
    And I select  '400 GB [+$100.00]' radio button
    And I select 'Vista Premium [+$60.00]' radio button
    And I select two check boxes ' Microsoft Office [+$50.00]' and  'Total Commander [+$5.00]'
    And I verify price '$1,475.00'
    And I click  'Add to cart '
    Then I should see message on top green bar like 'The product has been added to your shopping cart' on Top green Bar'






