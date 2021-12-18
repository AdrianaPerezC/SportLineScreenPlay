Feature: HU-002 Buscador SportLine
  Yo como usuario de SportLine
  quiero buscar un producto en la plataforma
  para ver el nombre del producto

  Background:
    Given Dado que me encuentro en la pagina

  Scenario: Seleccionar promociones
    When seleccione la seccion promociones de la pagina SportLine
    Then vemos los productos en promocion

  Scenario: seleccionar el primer producto que aparezca en promociones
    When selecciono uno de los productos aleatorios que aparece
    Then visualizo las caracteristicas del producto seleccionado