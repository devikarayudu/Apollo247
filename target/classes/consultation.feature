Feature: Apollo247 Online Doctor Consultation

  @login
  Scenario: User is able to login
    Given User is on the Apollo247 home page
    When User clicks on login button
    And User is able to give mobilenumber
    And User is able to write otp
    Then User is able to Login

  @navigate
  Scenario: User is able to click on consult page
    Given User is on the Doctor consultation page
    When the User clicks on consult button
    Then the User should be able to view the consult page

  @search
  Scenario: User is able to click on search button
    Given User is on Consult page
    When User clicks on search  button
    Then the user is able to search particular doctor
    
  @city
  Scenario: User is able to click on popular cities
    Given User is on consult page
    When the User clicks on particular city
    Then the User is able to see all the doctors in that city
    
  @doctor
  Scenario: User is able to choose Doctor
    Given User is on consult page
    When the User clicks on particular doctor from a particular city
    Then The User is able to see the doctor in the page
  
 
