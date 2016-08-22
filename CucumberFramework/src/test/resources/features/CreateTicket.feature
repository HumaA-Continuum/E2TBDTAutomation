Feature: As a user login to Noc Portal and Naviagte to Manual Triage Page.
@WIP
Scenario Outline: Login to Noc Portal 

Given User naviagte to NOC portal
When Enter Login credentials "<EmailId>" and  "<Password>"
Then Login to Portal
 And  Dashboard is displayed by default

 Examples: 
 |      EmailId                |  Password  |
 | user_sdm | sdm@1234 |
 
 Scenario Outline: Verify authorized login

 Given User can navigate to ITS Portal
 When Enter Login credentials "<EmailId>" and  "<Password>"
 Then Verify user is login to ITS portal
 And  Dashboard is displayed by default
 And Verify user is able to logout
 And Update Result to TestRail "<TestCaseId>"
 Examples: 
 |      EmailId                |  Password  |TestCaseId|
 | automationBDD@continuum.net |  Abc@12345 | 12345    |