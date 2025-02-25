Feature: Application Login

Background:
# Given Setup the entries in database : For this step - I rely on Hook
When Launch the browser from config variables
And Hit the login page url of net banking


@MobileTest @NetBankingTest
Scenario: User Page default login
Given User is on NetBanking landing page
When User login into application with username "user" and password "12345"
Then Home page is displayed
And Cards are displayed

@SmokeTest @RegressionTest @MortgageTest	
Scenario Outline: Mortgage User Page default login
Given User is on NetBanking landing page
When User login into application with username "<username>" and password "<password>"
Then Home page is displayed
And Cards are displayed

Examples:
  |   username   |   password   |
  |   stockuser  |   85647899   |
  |   sipuser    |   43212342   |
  |   fduser     |   10201211   |
  


  
  