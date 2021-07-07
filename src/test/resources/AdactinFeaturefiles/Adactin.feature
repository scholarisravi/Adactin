@Hooks
Feature: To validate Login Functionality
 
  
 Scenario Outline: To validate the login using valid credentials
    Given user is in Adactin login page
    When user enter valid "<Username>" and "<Password>"
    And user click login button

    Examples: 
      | Username      | Password |
      | Scholarisravi | May2021  |

  Scenario Outline: Verify the search hotel page
    When user select hotel details "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Adults per Room>" and "<Children per Room>"
    Then user click search button

    Examples: 
      | Location  | Hotels         | Room Type | Number of Rooms | Adults per Room | Children per Room |
      | Sydney    | Hotel Creek    | Standard  | 2 - Two           | 2 - Two           | 2 - Two            |
      

  Scenario Outline: Verify the hotel details
    When user select hotel details
    Then user click continue button
 

  Scenario Outline: fill the required details
    When user has to fill the details "<Firstname>","<Lastname>","<BillingAddress>","<Cardno>","<Cardtype>","<Month>","<Year>" and "<CvvNumber>"
   
    
    Examples:
      | Firstname   | Lastname  | BillingAddress | Cardno           | Cardtype         | Month   | Year | CvvNumber |
      | Ravishankar | Saravanan | Chennai        | 2242652566451234 | American Express | January | 2022 |       123 |

  Scenario Outline: Verify the booking page
    When user is in booking confirmation page
    Then user click logout button
