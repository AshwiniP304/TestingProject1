Feature: Umrah Bookings Hotel Booking flow

  Scenario: Check Hotel booking flow
    Given Umrah Bookings UAT site Open in ChromeBrowser
    And ashwinip@puratech.in value in username field.
    Then Enter 715715 value in password fields.
    And Agent should be login to Umrah Booking UAT.
    Then make a hotels search
    And select hotel for booking
    And click on book button
