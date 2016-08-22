Feature: As a user login to Noc Portal and Naviagte to Manual Triage Page.
@WIP
Scenario Outline: Login to Noc Portal 

Given User naviagte to NOC portal
When Enter Login credentials "<EmailId>" and  "<Password>"
Then Verify user is Login to Portal
Then Navigate to Manual triage

 Examples: 
 |      EmailId                |  Password  |
 | user_sdm | sdm@1234 |