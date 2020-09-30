Feature: This feature will add two numbers and check whether the result is even or odd
Scenario Outline: It will be verify if the data addition is even or not
	Given User has <num1> and <num2>
	When User add two numbers
	Then Addition result must be even
	
	Examples:
	|num1|num2|
	|20|30|
	|15|20|
	|68|54|
	|101|3078|
	|1000|200|