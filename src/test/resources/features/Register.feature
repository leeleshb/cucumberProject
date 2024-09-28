@all
Feature: User registration
User should register his account to access all the features

Background:
Given User navigates to register account page

@register @mandatoryfields @regression @smoke
Scenario: Register an account with only mandatory fields
When User enters first name "Leelesh" in first name field
And enters last name "Bokde" in the last name field
And enters email address "bokde.leelesh411@gmail.com" in the email address field
And enters telephone no. "1234567890" in the telephone field
And enters password "12345" in the password field
And enters password "12345" in the confirm password field
And clicks on privacy policy checkbox
And clicks on continue button
Then User get successfully registered

@register @allfields @regression
Scenario: Register an account by providing all fields
When User enters first name "Leelesh" in first name field
And enters last name "Bokde" in the last name field
And enters email address "bokde.leelesh412@gmail.com" in the email address field
And enters telephone no. "1234567890" in the telephone field
And enters password "12345" in the password field
And enters password "12345" in the confirm password field
And selects yes option from newsletter radio button
And clicks on privacy policy checkbox
And clicks on continue button
Then User get successfully registered

@register @nofields @regression
Scenario: Register an account without providing any fields
When User has not enters any field
And clicks on continue button
Then User gets warning messages for all mandatory fields

@register @duplicateemail @smoke
Scenario: Register an account by providing duplicate email address
When User enters first name "Leelesh" in first name field
And enters last name "Bokde" in the last name field
And enters email address "bokde.leelesh4@gmail.com" in the email address field
And enters telephone no. "1234567890" in the telephone field
And enters password "12345" in the password field
And enters password "12345" in the confirm password field
And clicks on privacy policy checkbox
And clicks on continue button
Then User gets warning message as duplicate email address

