Feature: Calcular

  Scenario Outline: Calculo
    Given Ingresamos a la calculadora
    When Agregamos los <datos>
    Then Obtenemos el <resultado>

    Examples:
      | datos |  | resultado |
      | 5+5   |  | 10        |
      | 6/3   |  | 2         |
      | 2*4   |  | 8         |
      | 5-3   |  | 3         |