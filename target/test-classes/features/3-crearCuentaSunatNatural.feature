Feature: Crear Cuenta Exta
  
  As i guest
  I want to login
  So that ...

  @Crear_Cuenta_Sunat_Natural
  Scenario Outline: Crear_Cuenta
    Given page of autenticacion is all ready
    When guest select MR services
    And seleciona crear cuenta vuce
    And ingresa parametros nueva cuenta sunat natural "<ruc>" and "<usuario>" and "<contrasena>" and "<dni>"
    Then se comprueba el envio de codigo
    
    Examples: 
      | ruc         |  | usuario  |  | contrasena |  | dni      |
      | 10452851461 |  | DCC14611	|  | DCC51461   |  | 45285146 |