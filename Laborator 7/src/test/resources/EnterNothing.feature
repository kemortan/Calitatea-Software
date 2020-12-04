Feature: Enter nothing in search field
	Scenario: Check if user entered nothing and clicked search the nothing should occur
		Given Google Chrome is opened
		When User entered nothing in search field
		And User clicks on search button
		Then Nothing should occur