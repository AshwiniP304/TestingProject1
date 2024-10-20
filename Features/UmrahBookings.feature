Feature: Umrah Bookings Hotel Booking flow

  Scenario: Check Hotel booking flow
    Given Umrah Bookings site Open in ChromeBrowser
    And navigate to http://umrahbooking.com/
    When Enter kunal@puratech.in value in username field.
    And Enter 123 value in password field.
    And agebt should be login to Umrah Booking.
    Then make a hotel search
    And select hotel to book
    And click on book
