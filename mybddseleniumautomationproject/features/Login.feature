#Author: Bharath
#Feature: List of scenarios related to Login Module
Feature: Login feature of DemoBlaze Application

	@regression
  Scenario: Test valid login functionality
    Given user opened the browser
    When user navigated to DemoBlaze Application URL
    And clicks on Login link
    And user enters user name 'bharathedu1' and password as '123456'
    And click on Login button
    Then the home page is displayed

  Scenario: Test valid invalid functionality
    Given user opened the browser
    When user navigated to DemoBlaze Application URL
    And clicks on Login link
    And user enters user name 'bharathedu1' and password as '123456343'
    And click on Login button
    Then error popup is displayed
