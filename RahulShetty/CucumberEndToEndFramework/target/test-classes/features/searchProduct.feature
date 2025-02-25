Feature: Search and place the order for products

Scenario: Search functionality for product search in both home and offer page
Given User is on GreenKart landing page
When User search with shortname "Tom" and extracted actual name of product
Then User searched for "Tom" shortname in offers page
And Validate product name in offers page matches with landing page
