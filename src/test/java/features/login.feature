Feature: feature: Hotel Booking in Adactin Application

Scenario: User Login In The Web Application 
	Given user Launch  The Adactine Application 
	When user Enter The Username in username field 
	And user Enter The password in password field 
	Then user clicks the login button and navigate to the Search Hotel page 
	
Scenario: User Fill The Details Search Hotel Page 
	Given user Launch  The Adactine Application 
	When user select the location by the dropdown 
	And user select the Hotels by the dropdown 
	And user select the Room Type by the dropdown 
	And user select the Number of Rooms by the dropdown 
	And user select the Check In Date by the dropdown 
	And user select the Check Out Date by the dropdown 
	And user select the Adults per Room by the dropdown 
	And user select the Children per Room by the dropdown 
	Then user clicks the Search button and navigate to the Select Hotel page 
	
	
	
Scenario: User Fill Details Select Hotel 
	Given user Launch  The Adactine Application 
	When user select the Particular Radio Button 
	Then user click the continue button and navigate to the Book A Hotel page 
	
		
	
Scenario: User Fill Details Book A Hotel 
	Given user Launch  The Adactine Application 
	
	When user Enter The First Name in First Name field 
	
	And user Enter The Last Name in Last Name field 
	And user Enter The Billing Address in Billing Address field 
	And user Enter The Credit Card No in Credit Card No field 
	And user select the Credit Card Type by the dropdown 
	And user select the Expiry Date by the dropdown 
	And user Enter The CVV Number in CVV Number field 
	Then user click Book Now button and  navigate to the Booking Confirmation page 
	
	
	
Scenario: User verify the booked details 
	Given user Launch  The Adactine Application 
	Then user click Book Now button and  navigate to the successfully logged out page 
	
	
	
	
          