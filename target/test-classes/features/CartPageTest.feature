Feature: Testing of Cart Page Functionalities


  Background:
    Given User open website
    Then  Verify user is on login page
    When User enter the valid credentials
    Then Verify home page is displayed
    When User search with TV
    Then Verify user is on product listing page
    When User click on the first product from the list
    Then Verify user is on product detail page
    When User click on add to cart button
    Then Verify cart page is displayed

@Smoke
  Scenario: Verify user can add item into cart
    And verify item on the cart page

@Regression
   Scenario: Verify user can remove item from cart
     When user remove item from the cart
     Then verify no item present in the cart


  Scenario: Verify user can change quantity on cart page
    When user change quantity of the item
    Then verify total quantity updated on the cart