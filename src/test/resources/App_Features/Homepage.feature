Feature: Homepage functionality of QaFox

Scenario: Verify page title of homepage

Given User is at homepage of QaFox
Then Page title should be display as "Your Store" 

Scenario: Verify shopping cart icon on homepage
Given User is at homepage of QaFox
Then Shopping cart icon should be display on homepage


Scenario: Checkout feature fucntionality on homepage
Given User is at homepage of QaFox
When User clicks on iphone of featured option
Then User able to see brand name of iphone as "Apple"

Scenario Outline: Login functionality of QaFox
Given User is at homepage of QaFox
When User clicks on My account dropdown
And User clicks on login option
And User enter login credentials as "<Email addess>" and "<Password>"
And User clicks on login button
Then User should be redirected to my account page as "My Account"

Examples:
|Email addess             |Password  |
|priya.patil6614@gmail.com|Piyu@1903 |