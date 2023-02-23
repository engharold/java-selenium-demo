Feature: Product Checkout

  Scenario Outline: Product Checkout
    Given I am on the application page
    And I log in to the application
    When I add the product <productName> to the cart
    And I validate that the product <productName> was added successfully
    And I click checkout button
    And I fill the <firstName> <lastName> <zipCode> at Checkout Your Information page
    And I click continue button
    And I validate the product <productName> at Checkout Overview page
    And I finish the order
    Then the order is completed successfully

    Examples:
      |     productName     | firstName |  lastName  | zipCode |
      | Sauce Labs Backpack |   Test    | Automation | 123456  |
