Feature: Google search testing

@GoogleTest
Scenario Outline: Verify if valid google search is working

Given Browser is open
And User is in on google search page
When User Enters <Search> content 
And Hits Enter
Then User shoud be navigated to  Search results
Examples:
|Search|
|Testing Automation|

