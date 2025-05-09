Feature: Add Employee


  Background:
    When user enters valid username and password
    And user clicks on login button
    Then user is able to see the dashborad page
    When user clicks on PIM option
    And user clicks on Add employee option


    @employeecredentials @addemployee @totaltest
    Scenario: Adding the employee by firstname middlename and lastname
      And user enters firstname middlename and lastname
      And user clicks on save button
      Then employee is added sucessfully


    @employeeid @addemployee @totaltest
    Scenario: Adding the employee by firstname lastname and id number
      And user enters firstname and lastname
      And user enters employees id number
      And user clicks on save button
      And user clicks on the employee list button
      And user searches employees id number
      Then user clicks search button


