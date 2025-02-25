Feature: Application Login

Background:
Given setup the entries in database
When Launch the browser from config variables
And Hit the handing page url of net banking site


@RegressionTest
Scenario: Admin Page default login
Given User is on NetBanking landing page
When User login into application with username "admin" and password "12345"
Then Home page is displayed
And Cards are displayed

@MobileTest
Scenario: Transport Page default login
Given User is on NetBanking landing page
When User login into application with username "Transport" and password "12345"
Then Home page is displayed
And Cards are displayed

@RegressionTest
Scenario Outline: User Page default login
Given User is on NetBanking landing page
When User login into application with username "<username>" and password "<password>"
Then Home page is displayed
And Cards are displayed
# If we don't use Examples then we have to make diff diff scenarios for each user but we have a feature 'Scenario Outline' to parametrize the Test
#  so we will make a Data Table like below to run same Test Case with multiple data set
Examples:
  |   username   |   password   |
  |   stockuser  |   85647899   |
  |   sipuser    |   43212342   |
  |   fduser     |   10201211   |
  

@SmokeTest @RegressionTest
Scenario: User Page default sign up
Given User is on Practice landing page
When User Signup for the application
| Vishesh |
| Malik   |
| Vish@gmail.com |
| 9856785432 | 
Then Home page is displayed
And Cards are displayed
  
  