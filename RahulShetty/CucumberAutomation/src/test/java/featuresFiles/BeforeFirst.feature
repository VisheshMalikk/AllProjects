Feature: Application Balance functionality
# Sequence of execution : Before-> Background -> Scenario -> After
# For common steps - we have a keyword Background at Feature level
# So the scope level of these common steps (In Background) lies only in the feature file
Background:
Given Setup the entries in database
When Launch the browser from config variable
And Hit the login page url of net banking

#1
@RegressionTest
Scenario: Admin check balance

Given Admin is on login page of Netbanking
Then User entered username "admin" and password "1234"
When Click on login button and logged into application
When Click on check balance button
Then Balance is displayed

# A feature can have multiple scenario or test cases
#2
@MobileTest
Scenario: User check balance
Given User is on login page of Netbanking
Then User entered username "user" and password 000111
When Click on login button and logged into application
When Click on check balance button
Then Balance is displayed

# Now the scenario or use case is when we have to perform login functionality with different set of data for that we have concept Scenario Outline
# Instead of writing multiple scenario you can simply parameterize single scenario 
# So if you want to run below scenario 'n' no of times besed upon how many rows are there in the table (Examples table below)
# <> with this bracket cucumber assume this step is parametrized
# So this is how you can parametrized steps in cucumber

# "Scenario Outline" is a powerful feature in Cucumber for handling data-driven testing scenarios.
# Data Driven Testing : Scenario and scenario outline also data driven testing
# Now lets suppose there is a scenario where you have enter 10 values in the form, so how will you send all values
# Send all values in the step line is not a good practice like
# Then User entered firstname "Vishesh" and lastaname "Malik" and mobile "8859183678" and profession "Software Engineer" and companyname "Coforge" etc
# So how will you make it better

#3
@SmokeTest @RegressionTest
Scenario Outline: Broker check balance
Given User is on login page of Netbanking
Then User entered username "<username>" and password "<password>"
When Click on login button and logged into application
When Click on check balance button
Then Balance is displayed
Examples:
  |   username   |   password   |
  |   stockuser  |   85647899   |
  |   sipuser    |   43212342   |
  

#4
@SmokeTest
Scenario: User Signup page
Given User is on Signup page of Netbanking
When User entering the value in the fields of form
# this is on step level : For 1-2 values we can give values in the step but where step consumes more details then we need like below
| Vishesh |
| Malik   |
| Vish@gmail.com |
| 9856785432 | 
And User click on submit button
Then User account is created successfully

# If you have 4 scenarios then how would you run 1 scenario only or set of scenario? 
# With the help of tags, you can add multiple tags to one scenario as well


