Feature: Realizar operaciónes

  Scenario Outline: Realizar operaciones de enteros
    Given que el usuario ingreso a la calculadora
    When el unsuario realiza la operacion<operacion> de los numeros <num_uno>, <num_dos> y <num_tres>
    Then el usuario debera ver el <resultado>
    Examples:
      | operacion        | num_uno | num_dos | num_tres | resultado |
      | "suma"           | 5       | 5       | 5        | 15        |
      | "Resta"          | 40      | 20      | 5        | 15        |
      | "multiplicacion" | 3       | 5       | 1        | 15        |
      | "division"       | 60      | 2       | 2        | 15        |