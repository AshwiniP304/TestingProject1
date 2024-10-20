Feature: Google Search
   
 
 Scenario Outline: Verify Google Search functionality by search some product.
    Given launch Chrome Browser
    And Navigate to https://www.google.com/
    When search the "<product>"
    Then I verify the "<Title>" in step

    Examples: 
      | product  | Title                 | 
      | shoes    | shoes - Google Search | 
      | watch    | Watch - Google Search | 
      | goPro    | gopro - Google Search |
      | phone    | phone - Google Search |
      
