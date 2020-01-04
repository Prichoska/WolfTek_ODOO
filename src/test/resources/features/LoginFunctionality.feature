Feature:LoginFunctionality
  @login
  Scenario: Login
    Given user is on login page for ERP brite
    When user login with username "eventscrmmanager34@info.com" and  password "eventscrmmanager"
    Then verify page title is "#Inbox - Odoo"
