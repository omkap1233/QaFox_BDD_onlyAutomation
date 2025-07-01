Feature: Search functioanlity of QaFox

Scenario: Search product in search feild
Given User is at homepage of QaFox
When User enters a product name as "Macbook"
Then All items related should display as "MacBook" "MacBook Air" "MacBook Pro"