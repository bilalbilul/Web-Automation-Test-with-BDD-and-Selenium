@Sales
  Feature: Sales flow
    description Class

  Scenario: User make a purchase with 2 item
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on landing Page
    Then User sort product list by "Name (Z to A)"
    And User choice 2 product from the list
    And User click button Chart
    And User remove 1 product from the list
    And User click Continue Shopping
    And User click button Chart
    And User click Button Checkout



