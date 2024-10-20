Feature: Login

  Scenario: Check Login Functionality
    Given FrontAccounting site Open in ChromeBrowser
    When Enter demouser value in username field.
    And Enter password value in password field.
    Then user should be login.
    And Validate whether user is login or not by checking sales quotation entry.
