Feature: Crear Cuenta Exta
  
  As i guest
  I want to login
  So that ...

  @Crear_Cuenta_Sunat
  Scenario Outline: Crear_Cuenta
    Given page of autenticacion is all ready
    When guest select MR services
    And seleciona crear cuenta vuce
    And ingresa parametros nueva cuenta sunat "<ruc>" and "<usuario>" and "<contrasena>" and "<dni>"
    Then se comprueba el envio de codigo
    
    Examples: 
      | ruc         |  | usuario  |  | contrasena |  | dni      |
      | 20506601330 |  | DCC25301 |  | DCC01330   |  | 40038284 |