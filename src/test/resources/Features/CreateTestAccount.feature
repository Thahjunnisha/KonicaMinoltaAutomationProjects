

@CreatingTestAccount
Feature: Create Test Account
 

  
  Scenario Outline: create Gmail Test Account
    Given User is on "GmailSignupPage"
     When User enter FirstName as '<FirstName>'
       And User enter LastName as '<LastName>'
    And User enter UserName as '<UserName>'
    And User enter Password as '<Password>'
    And User enter ConfirmPassword as '<ConfirmPassword>'
    And click NextButton
      And User enter PhoneNumber as '<Phonenumber>'
    And click NextButton2
     And User enter Verificationcode 
    And User enter BirthDate as '<BirthDate>'
    And User enter BirthMonth as '<BirthMonth>'
    And User enter BirthYear as '<BirthYear>'
    And User enter Gender as '<Gender>'
    And click NextButton2
       Then click YesIAmIn
    And click IAgree
    Then User verify successful account creation
    
    
    Examples: 
 | FirstName          | LastName            | UserName|Password|ConfirmPassword |Phonenumber |BirthDate|BirthMonth|BirthYear|Gender|
 |TestaccountFirstname|TestaccountLastname  |ttw6t5   |Apr#2021|Apr#2021	      |9176791853  |	28	   |June	    | 1988	  |Female|

     
    

  