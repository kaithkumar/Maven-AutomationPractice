Feature: Booking Dress From Automation Practice Website
@firstPage
Scenario: Login Page
Given user Should Launch The Website
When user Click The Womens Button 
And user Selects The Sorting Option From The Dropdown
And user Click The Printed Dress And It Navigates To Printed Dress Page
And user Click The Add To Cart Button
Then user Click The Proceed To Checkout Button And It Navigates To Order Page
@secondPage
Scenario: Order Page
When user Clicks The Proceed To Proceed To Checkout Button And It Naviagates To Sign In Page
And user Enters The Username In The Username Field
And user Enters The Password In The Password Button
Then user Clicks The Proceed To Checkout Button And It Naviagtes To Shipping Page

Scenario: Shipment Page
When user Select The Terms Of Service Checkbox 
Then user Click The Proceed To Checkout Button And It Navigates To Payment Page

Scenario: Payment Page
When user Click The Pay By Check Option It Navigates To Order Summary Page
Then user Click The I Confirm My Order Button And It Navigates To Order Confirmation Page
 
