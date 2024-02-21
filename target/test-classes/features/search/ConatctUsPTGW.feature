Feature: PTGW for ContactUS page

  @UnitTest
  Scenario Outline: Contact Us for PTGW with multiple examples
    Given I enter the URL
    When I click on Home page button and then Contact us button
    Then I enter details '<Username>' '<Email>' and '<Message>'
    And I click on submit contact details
    Examples:
      | Username | Email           | Message                 |  |
      | disha    | dishali.khilari | Sample message          |  |
      | John     | john.smith      | Trial Message           |  |
      | Test     | Test1@gmail     | Message from Automation |  |

