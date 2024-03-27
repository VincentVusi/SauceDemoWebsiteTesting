@MyLogin
  Feature: Login Test
    This test will test login

  @Login
  Scenario: Successful login with Valid Credentials
    Given User is on the login page
    When User enters valid username and password
      | Username | Password |
      | standard_user | secret_sauce |
    And Clicks on the login button
    Then Redirect to Inventory Page
