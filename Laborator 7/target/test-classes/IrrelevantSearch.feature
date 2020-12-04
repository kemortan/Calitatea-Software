Feature: Irrelevant Search
	Scenario Outline: If a person has searched irrelevant it should display the “Did you mean” link
		Given Google Chrome is opened
		When User enters '<Text>' in search field
		And User clicks on search button
		Then Did you mean text is displayed

		Examples:
			| Text     |
			| compture |