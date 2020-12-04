Feature: Displayed results on a single page
	Scenario Outline: Check how many results are displayed on a single page
		Given Google Chrome is opened
		When User enters '<Text>' in search field
		And User clicks on search button
 		Then Number of displayed results on a single page is counted

		Examples:
		| Text        |
		| Random Text |