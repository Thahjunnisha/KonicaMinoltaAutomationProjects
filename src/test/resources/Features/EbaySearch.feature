

@tag
Feature: Ebay Search Product


  @tag2
  Scenario Outline: EbaySearch
    Given user is on "EbayHomePage"
    When I search for '<Products>'
    And I click on search
    Then Print the  price

    Examples: 
      | Products        | 
      | Electric Guitar | 
      
