Feature: OrangeHRM application login functioanlity Testing
Scenario Outline: Validating LogIn Functioanlity

Given Open firefox browser and navigate to OrangeHRM application
When User enters valid "<UserName>" and valid "<Password>" and click on SignIn button
Then User should be able to successfully logIn the application and close the application

Examples:
|		UserName  |    Password  |
|		admin		  |    password  |
|		hello		  |    Password  |