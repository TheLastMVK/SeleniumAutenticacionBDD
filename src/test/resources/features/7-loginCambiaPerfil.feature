Feature: Logear y Cambiar perfil
  
  As i guest
  I want to login
  So that ...

  @Logear_y_Cambiar_perfil
  Scenario Outline: logear y cerrar sesion
    Given page of autenticacion is all ready
    When guest select MR services
    And user enters credentials "<email>" and "<password>"
    And user select option a profile
    Then user can see MR2 page

    Examples: 
      | email            |  | password  |
      | backus@gmail.com |  | Vuce0424. |