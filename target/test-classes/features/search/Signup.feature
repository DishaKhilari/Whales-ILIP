@IntegrationTest
Feature: Valid Details for Signup

  Scenario: Valid Details for Signup
    Given I enter URL
    When I enter email address
    Then I enter first name and last name
    And I click on signup button

    @RegressionTest
  Scenario Outline: Valid Detail with some more data
    Given I enter URL
    When I enter my '<email>'
    Then I enter '<firstname>' and '<lastname>'
    And I click on signup button

    Examples:
      | email                      | firstname |  | lastname |
      | disha.khilari@gmail.com    | disha     |  | khilari  |
      | luke.l@yopmail.com         | luke      |  | l        |
      | sara.hum@yahoo.com         | sara      |  | hum      |
      | disha.khilari@owitechs.com | disha     |  | khilari  |
      | abc.abc@gmail.com          | abc       |  | abc      |