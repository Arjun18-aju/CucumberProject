@CEONameval
Feature: Verify the HMRC URL
Scenario: To verify the CEO Name
Given user land on the HMRC portal url
When user login with valid username and password 
And user clicks the  directory tab
And user select job title as "Chief Executive Officer"
And user click on search tab
Then user able to see the results


