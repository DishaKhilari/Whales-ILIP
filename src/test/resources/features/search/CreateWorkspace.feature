Feature: Create you Own Workspace

  @RegressionTest
  Scenario: Create Workspace
    Given web URL
    When enter email address
    Then enter how you hear about us
    When you select my goal
    And Biggest Challenge
    Then Click next

    Scenario Outline: Create Workspace with multiple data
      Given I enter URL
      When I enter my '<email>'
      Then enter '<aboutUs>'
      When you select my goals
      And add '<biggestChallenge>'
      Then Clicked next

      Examples:
        | email               | aboutUs | biggestChallenge  |
        | abc@gmail.com       | Online  | To break high     |
        | sample@yahoo.com    | Friends | To achieve dreams |
        | tryonce@hotmail.com | Email   | To get job        |