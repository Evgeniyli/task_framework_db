Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Verify create user with parameters in the database

Given I connect to database
When I create users with parameters
When I get users from list
When I create table by name

Scenario: Verify correct to select user by FirstName, LastName, Age

Given I find a user by named <FirstName>
Then I check user is <FirstName> firsName
And I check user is <LastName> lastName
And I check  age of a user is <Age> years

Examples:
|FirstName|LastName|Age|
|Jeck|Poter |23|
|Polly|Jennifer|35|
|Anna|Simpson|18|

