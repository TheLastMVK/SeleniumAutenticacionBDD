Feature: Login User
  
  As i guest
  I want to login
  So that ...

  @scenario1
  Scenario Outline: login a user
    Given page of autenticacion is all ready
    When guest select MR services
    And user enters credentials "<email>" and "<password>"
    Then user can see MR2 page

    Examples: 
      | email                  |  | password  |
      | andres_v13@hotmail.com |  | Vuce0424. |