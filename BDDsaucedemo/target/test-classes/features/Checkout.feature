@Checkout
  Feature: Checkout
    as a user i want to checkout

    Scenario: Normal Checkout
      Given User open the website sauce demo
      When User input "standard_user" as userName and input "secret_sauce" as password
      Then User already on landing Page
      Then User sort product list by "Name (Z to A)"
      And User choice 2 product from the list
      And User click button Chart
      And User remove 1 product from the list
      And User click Button Checkout
      And User already on Checkout Page
      Then User input "Muhammad" as firstName and input "Bilal" as lastName and input "11530" as zipCode
      And User click button Continue
      Then User already on Overview Page
      And User click button Finish

    Scenario Outline: validation form
      Given User open the website sauce demo
      Examples:
        |  |