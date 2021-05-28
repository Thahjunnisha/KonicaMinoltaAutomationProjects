Feature: Login Feature

  @HappyPathScenario
  Scenario: Login Successfully with Valid Credentials
    Given User enters "GmailSigninPage"
    When User enters EmailId as '<UserName>' to LogIn
     
    And Click on Next button
    And User enters Password to '<Password>' to LogIn
  
    And Click on Next button
    Then verify the login is successful
     
     Examples: 
      | UserName  | Password    |
      | tajukutty | Asrafali@36 |
      
    

  @NegativeScenarios
 
 Scenario: Login Successfully with blank UserName
    Given User enters "GmailSigninPage"
    When User enters EmailId as " " to LogIn
    And Click on Next button
   Then Verify the Blank EmailId Error Message
    
    
    @NegativeScenarios
 
 Scenario: Login Successfully with Invalid UserName
    Given User enters "GmailSigninPage"
    When User enters EmailId as "$355" to LogIn
     
    And Click on Next button
   
   Then User validate the Invalid EmailId error message
    
