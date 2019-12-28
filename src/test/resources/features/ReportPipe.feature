@RP
Feature: ReportPipe
  Background: login
    Given user is on login page for ERP brite
    When user login with username "eventscrmmanager34@info.com" and  password "eventscrmmanager"
    Then verify page title is "#Inbox - Odoo"
    And user clicks on the "CRM module"



  @wip
  Scenario:Tag Confirmation
    When user clicks on Pipeline option
    Then make sure Opportunity tag available

  @wip2
  Scenario: Tag Confirmation continue test
    When  user clicks on Pipeline option2
    Then verify that it should diplay text
