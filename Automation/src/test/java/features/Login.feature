Feature: Application Login

Scenario: Home page default login
Given User is on Netbanking landing page 
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards are displayed "True"

Scenario: Home page default login
Given User is on Netbanking landing page 
When User login into application with "john" and password "4321"
Then Home page is populated
And Cards are displayed "False"
