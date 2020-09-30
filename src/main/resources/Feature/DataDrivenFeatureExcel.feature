Feature: This feature will take value from excel fileand add two numbers and check whether the result is even or odd
Scenario Outline: It will be verify if the data addition is even or not
	Given User has Two Number from <row>
	When User add two numbers from excel
	Then Addition result must be even from Excel
	
	Examples:
	|row|
	|1|
	|2|
	|3|
	|4|
	|5|
	|6|
	|7|
	|8|