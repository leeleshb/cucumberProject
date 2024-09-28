@all
Feature: Search 
User can search for valid as well as non valid products

Background:
Given User opens an application

@search @validproduct @regression @smoke
Scenario: Search for a valid product
When user enters a valid product name in the search field
And clicks on search button
Then valid product should be displayed

@search @invalidproductt @regression
Scenario: Search for an invalid product
When user enters an invalid product name in the search field
And clicks on search button
Then User gets text message about there is no product that matches the search criteria

@search @noproduct @regression
Scenario: Search without entering product name
When user do not enter any product name in the search field
And clicks on search button
Then User gets text message about there is no product that matches the search criteria
