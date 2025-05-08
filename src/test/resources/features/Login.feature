Feature: Login steps


  @emptyUsername @loginsteps
  Scenario: blank username credentials
    When user enters blank username
    And user enters valid password
    And user clicks on login button
    Then user is able to see error message

  @emptyPassword @loginsteps
  Scenario: blank password credentials
    When user enters valid username
    And user enters blank password
    And user clicks on login button
    Then user can see error message

  @InvalidCredentials @loginsteps
  Scenario: invalid username and password login credentials
    When user enters invalid username
    And user enters invalid password
    And user clicks on login button
    Then user sees error message