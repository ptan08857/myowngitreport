#Author: Bharath
#Feature: List of scenarios related to Login Module
Feature: Login feature of DemoBlaze Application

  Background: 
    Given user opened the browser
    When user navigated to DemoBlaze Application URL
    And clicks on Login link

  Scenario: Test valid login functionality
    And user enters user name 'bharathedu1' and password as '123456'
    And click on Login button
    Then the home page is displayed

  Scenario: Test valid invalid functionality
    And user enters user name 'bharathedu1' and password as '123456343'
    And click on Login button
    Then error popup is displayed
