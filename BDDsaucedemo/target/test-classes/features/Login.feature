@Login
  Feature: Login
    as a user i want to login website sauce demo

    Scenario: Normal login
      Given User open the website sauce demo
      When User input "standard_user" as userName and input "secret_sauce" as password
      Then User already on landing Page

    Scenario Outline: Invalid Login
      Given User open the website sauce demo
      When User input "<userName>" as userName and input "<Password>" as password
      Then User see error "<errorText>" on Login Page
      Examples:
        | userName      | Password     | errorText                                                                 |
        | standard_user |              | Epic sadface: Password is required                                        |
        |               | secret_sauce | Epic sadface: Username is required                                        |
        | asd           | 123          | Epic sadface: Username and password do not match any user in this service |