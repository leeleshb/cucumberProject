@all
Feature: Logout fumctionality
User can successfully logout from the application

Background: User navigates to logout page

Scenario: verify logout from my account dropdown
When user clicks on my account option
And Select logout option
Then user should be taken to account logout page
And user clicks on continue button present there
Then user should be taken to home page