Feature: Logear y Actualizar Cuenta
  
  As i guest
  I want to login
  So that ...

  @Logear_y_Actualizar_Cuenta
  Scenario Outline: logear y actualizar cuenta
    Given page of autenticacion is all ready
    When guest select MR services
    And user enters credentials "<email>" and "<password>"
    And user select option administrar cuenta
    And user actualiza cuenta "<password>" and "<nuevocorreo>" and "<nuevacontrasena>"
    Then user can see MR2 page

    Examples: 
      | email            |  | password  |  | nuevocorreo                 |  | nuevacontrasena  |
      | backus@gmail.com |  | Vuce0424. |  | the.last.maverick@gmail.com |  | Vuce0424.        |