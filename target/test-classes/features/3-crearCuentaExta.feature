Feature: Crear Cuenta Exta
  
  As i guest
  I want to login
  So that ...

  @Crear_Cuenta_Exta
  Scenario Outline: Crear_Cuenta
    Given page of autenticacion is all ready
    When guest select MR services
    And seleciona crear cuenta vuce
    And ingresa parametros nueva cuenta exta "<usuario>" and "<clave>"
    Then se comprueba el envio de codigo
    
    Examples: 
      | usuario  |  | clave    |
      | EXTA0125 |  | EXTA0125 |