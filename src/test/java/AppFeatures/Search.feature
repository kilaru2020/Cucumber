Feature: Amazon Search

Scenario: Search a product
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook Air" and  price 2000
Then Product with name "Apple MacBook Air" should be displayed