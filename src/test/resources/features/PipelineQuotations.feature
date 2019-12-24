@login
Feature: Pipeline Quotations
  Background: login
    Given user is on login page for ERP brite
    When user login with username "eventscrmmanager34@info.com" and  password "eventscrmmanager"
    Then verify page title is "#Inbox - Odoo"


@wip
    Scenario:Information on Quotation Page
      Given user click on CRM module
      When user user click on Quotations under Pipeline
      Then user should be able to see all the information about Customer




