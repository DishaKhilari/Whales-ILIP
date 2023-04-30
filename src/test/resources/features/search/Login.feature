Feature: Invalid Data for Login

  Scenario: Login with invalid data
    Given web URL
    When enter email address
    Then enter first name
    Then enter last name and click on check box
    And click on Signup button