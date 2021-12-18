Feature: HU-002 Buscador SportLine
  Yo como usuario de SportLine
  quiero buscar un producto en la plataforma
  para ver el nombre del producto

  Background: Iniciar sesion
    Given Dado que navego en la pagina de inicio de sesion
    When envio el nombre del usuario y contrasena
      | email   | contrasena   |
      | <Email> | <Contrasena> |
    Then Inicio sesion

  Scenario: Buscar un producto y seleccionar el primer producto que aparezca
    Given Usuario busca Reebok
    When seleccione el primer producto que aparezca en la busqueda
    Then vemos las caracteristicas del producto Reebok

  Scenario: Visualizar el producto y anexarlo al carrito de compra
    Given navegando por el producto Reebok
    When anexar el producto al carrito de compra
    Then en la cesta de compra se debe visualizar el elemento anexardo