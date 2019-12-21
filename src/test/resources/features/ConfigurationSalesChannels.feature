@CSC
Feature: Configuration Sales Channels
  Background: login
    Given user is on login page for ERP brite
    When user login with username "eventscrmmanager34@info.com" and  password "eventscrmmanager"
    Then verify page title is "#Inbox - Odoo"
    And user clicks on the "CRM module"

  Scenario: Validate search box
    Given user clicks on the "Sales Channels"
    And validate that search box is displayed

  Scenario: Create sales channel functionality 
    Given user clicks on the "Sales Channels"
    When user clicks on the "Create"
    And user enters Sales team name as "Create test"
    And user clicks on the "Save"
    Then verify page title is "Create test - Odoo"
  @1
  Scenario: Delete created sales channel functionality
    Given user clicks on the "Sales Channels"
    When user clicks on the "Create"
    And user enters Sales team name as "Create test"
    And user clicks on the "Save"
    Then verify page title is "Create test - Odoo"
    When user clicks on the "Action"
    And user clicks on the "Delete"
    And user clicks on the "Ok"
    And verify that Sales Channels name is not "Create test"