Feature: Login functionality

Scenario: Login with valid credentials
Given User navigate to login page
When User enters valid email address "cesahil@gmail.com" into email field
And User enters valid password "Sahil@12" into password field
And User clicks on Login button
Then User should get successfully logged in


Scenario: Login with invalid credentials
Given User navigate to login page
When User enters valid email address "cesahil11@gmail.com" into email field
And User enters valid password "Sahil@123" into password field
And User clicks on Login button
Then User should get successfully logged in

#Scenario: Login without credentials
#Given User navigate to login page
#When User enters valid email address "" into email field
#And User enters valid password "" into password field
#And User clicks on Login button
#Then User should get successfully logged in