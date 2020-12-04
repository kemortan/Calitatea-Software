Feature: Google page is opening
	Scenario: Check if google page is opening or not
		Given Google Chrome is opened
		When User enter 'https://www.google.co.in' in the URL box
		Then Google page is open