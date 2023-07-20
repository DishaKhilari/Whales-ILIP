Feature: Create you Own Workspace

  Scenario: Create Workspace
    Given web URL
    When enter email address
    Then enter how you hear about us
    When you select my goal
    And Biggest Challenge
    Then Click next
    And Window closed

    Scenario Outline: Create Workspace with multiple data
      Given I enter URL
      When I enter my '<email>'
      Then enter '<aboutUs>'
      When you select my goals
      And add '<biggestChallenge>'
      Then Clicked next
      And Window closes

      Examples:
        | email               | aboutUs | biggestChallenge  |
        | abc@gmail.com       | Online  | To break high     |
        | sample@yahoo.com    | Friends | To achieve dreams |
        | tryonce@hotmail.com | Email   | To get job        |
        | owi@owitechs.com    | online  | to get in         |


      Scenario: New Testcase for same feature
        Given I enter URL
        When I enter email
        Then I enter details
        And select options
        #Then enter my challenge and click nexts
