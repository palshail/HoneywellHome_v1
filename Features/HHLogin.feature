Feature: Login for Production HH App


Scenario: Check with Login with vaild cridintials 
	Given User Launch Applocation application
	When User click on Login btn
	Then User set email adress as 
	And Password as 
	Then user click on authlogin btn
	Then system land script to dashboard
	
Scenario: As we want to check with Platfrom scnarios 
	Given verifiy user is logged in 
	When user navigate to platfrom screen
	Then system capture aviable text present in platfrom  
	And verifiy Activity history
	And verifiy Invite User
	And verifiy Adress 
	And verifiy Account Details
	And verifiy Connected Services
	And verifiy get Help
	And verifiy About the app
	
	
	
#Scenario: As user wants to logout
	# Given User is logged in and on dashboard
	# Then User click on globaldrwaer
	# And User logsOut
	