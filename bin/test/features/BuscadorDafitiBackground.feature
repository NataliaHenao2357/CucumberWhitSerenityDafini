Feature: Buscar productos en la Pagina Dafiti

  Background: 
    Given El usuario ingresa a la pagina de Dafiti https://www.dafiti.com.co

  Scenario: Buscar el producto en el buscador de Dafiti
    When busco un producto en el buscador
      | nombreProducto                            |
      | Jean Juvenil Femenino Azul Hielo Atypical |
    Then podre ver el producto buscado en la pantalla

  Scenario: Buscar el producto en el buscador de Dafiti
    When busco un producto en el buscador
      | nombreProducto                                |
      | TENIS FILA KIDS F-13 BLK/BLK/GUM 3VF80128-976 |
    Then podre ver el producto buscado en la pantalla
