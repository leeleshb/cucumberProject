@all
Feature: User Login
Registered user should be able to login to access account details

Background:
Given User navigates to login page

@login @validcredentials @smoke @regression @dev
Scenario Outline: Login with valid credentials		
When User enters valid email address <email>
And User enters valid password <password>
And User clicks on login button
Then User should login successfully
Examples:
|email										|password	|
|bokde.leelesh4@gmail.com	|12345		|
|amotooricap9@gmail.com		|12345		|
|amotooricap3@gmail.com		|12345		|

@login @invalidcredentials @regression
Scenario: Login with invalid credentials
When User enters invalid email address "bokde.leelesh1234@gmail.com"
And User enters invalid password "123456"
And User clicks on login button
Then User should get a proper warning message

@login @validemailandinvalidpassword @regression
Scenario: Login with valid email and invalid password
When User enters invalid email address "bokde.leelesh4@gmail.com"
And User enters invalid password "123456"
And User clicks on login button
Then User should get a proper warning message

@login @invalidemailandvalidpassword @smoke @wip
Scenario: Login with invalid email and valid password
When User enters invalid email address "bokde.leelesh1234@gmail.com"
And User enters invalid password "12345"
And User clicks on login button
Then User should get a proper warning message

@login @nocredential @regression @ignore
Scenario: Login without providing any credentials
When User do not enter any credentials
And User clicks on login button
Then User should get a proper warning message