Feature:  Verify different GET operations using REST-assured
	
Scenario: Verify one author of the post
	Given  I perform GET operation for "/posts/1"
	Then  I should see the author name as "john"
	
Scenario: Verify collection of authors in the post
	Given  I perform GET operation for "/posts"
	Then  I should see the author names

Scenario: Verify Path Parameter of Get
	Given  I perform GET operation for "/posts"
	Then  I should verify GET path parameter
	
Scenario: Verify Query Parameter of Get
	Given  I perform GET operation for "/posts"
	Then  I should verify GET query parameter
	
Scenario: Verify Post Operation
	Given  I perform POST operation for "/posts"

Scenario: Verify post operation for Profile
	Given  I perform POST operation for "/posts/{profileNo}/profile" with body
	| name | profile |
	| Sam  | 2  	 |
	Then  I should see body has name as "Sam"
	
	
	
	