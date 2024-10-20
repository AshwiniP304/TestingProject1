Feature: SauceDemo Login Fuctionality

  Scenario: Check Login Functionality
    Given SauceDemo site Open in ChromeBrowser
    When Enter standard_user value in username field.
    And Enter secret_sauce value in password field.
    And user should be login to sauceDemo.
    Then user should be logout.
    And check whether after logout Login Page displaying or not
